/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.data.pipeline.cdc.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.broadcast.rule.BroadcastRule;
import org.apache.shardingsphere.data.pipeline.core.exception.param.PipelineInvalidParameterException;
import org.apache.shardingsphere.infra.datanode.DataNode;
import org.apache.shardingsphere.infra.exception.core.ShardingSpherePreconditions;
import org.apache.shardingsphere.infra.metadata.database.ShardingSphereDatabase;
import org.apache.shardingsphere.infra.rule.attribute.datanode.DataNodeRuleAttribute;
import org.apache.shardingsphere.sharding.rule.ShardingRule;
import org.apache.shardingsphere.single.rule.SingleRule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * CDC data node utils.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CDCDataNodeUtils {
    
    /**
     * Build table and data nodes map.
     *
     * @param database database
     * @param tableNames table names
     * @return table and data nodes map
     * @throws PipelineInvalidParameterException thrown invalid parameter exception when can't get data nodes.
     */
    public static Map<String, List<DataNode>> buildTableAndDataNodesMap(final ShardingSphereDatabase database, final Collection<String> tableNames) {
        Optional<SingleRule> singleRule = database.getRuleMetaData().findSingleRule(SingleRule.class);
        Optional<BroadcastRule> broadcastRule = database.getRuleMetaData().findSingleRule(BroadcastRule.class);
        Optional<ShardingRule> shardingRule = database.getRuleMetaData().findSingleRule(ShardingRule.class);
        Map<String, List<DataNode>> result = new HashMap<>(tableNames.size(), 1F);
        // TODO support virtual data source name
        for (String each : tableNames) {
            if (singleRule.isPresent() && singleRule.get().getAttributes().getAttribute(DataNodeRuleAttribute.class).getAllDataNodes().containsKey(each)) {
                result.put(each, new ArrayList<>(singleRule.get().getAttributes().getAttribute(DataNodeRuleAttribute.class).getAllDataNodes().get(each)));
                continue;
            }
            if (broadcastRule.isPresent() && broadcastRule.get().getAttributes().getAttribute(DataNodeRuleAttribute.class).findFirstActualTable(each).isPresent()) {
                result.put(each, Collections.singletonList(broadcastRule.get().getAttributes().getAttribute(DataNodeRuleAttribute.class).getAllDataNodes().get(each).iterator().next()));
                continue;
            }
            if (shardingRule.isPresent() && shardingRule.get().findShardingTable(each).isPresent()) {
                result.put(each, shardingRule.get().getShardingTable(each).getActualDataNodes());
                continue;
            }
            throw new PipelineInvalidParameterException(String.format("Not find actual data nodes of `%s`", each));
        }
        ShardingSpherePreconditions.checkNotEmpty(result, () -> new PipelineInvalidParameterException(String.format("Not find table %s", tableNames)));
        return result;
    }
}
