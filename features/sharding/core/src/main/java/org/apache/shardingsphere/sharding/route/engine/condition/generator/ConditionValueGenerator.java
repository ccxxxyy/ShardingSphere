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

package org.apache.shardingsphere.sharding.route.engine.condition.generator;

import org.apache.shardingsphere.infra.metadata.database.schema.HashColumn;
import org.apache.shardingsphere.sharding.route.engine.condition.value.ShardingConditionValue;
import org.apache.shardingsphere.sql.parser.statement.core.segment.dml.expr.ExpressionSegment;
import org.apache.shardingsphere.timeservice.core.rule.TimestampServiceRule;

import java.util.List;
import java.util.Optional;

/**
 * Condition value generator.
 *
 * @param <T> type of predicate right value
 */
public interface ConditionValueGenerator<T extends ExpressionSegment> {
    
    /**
     * Generate route value.
     *
     * @param predicateRightValue predicate right value
     * @param column column
     * @param params SQL parameters
     * @param timestampServiceRule time service rule
     * @return route value
     */
    Optional<ShardingConditionValue> generate(T predicateRightValue, HashColumn column, List<Object> params, TimestampServiceRule timestampServiceRule);
}
