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

package org.apache.shardingsphere.encrypt.config;

import com.cedarsoftware.util.CaseInsensitiveSet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.encrypt.config.rule.EncryptTableRuleConfiguration;
import org.apache.shardingsphere.infra.algorithm.core.config.AlgorithmConfiguration;
import org.apache.shardingsphere.infra.config.rule.function.EnhancedRuleConfiguration;
import org.apache.shardingsphere.infra.config.rule.scope.DatabaseRuleConfiguration;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Encrypt rule configuration.
 */
@RequiredArgsConstructor
@Getter
public final class EncryptRuleConfiguration implements DatabaseRuleConfiguration, EnhancedRuleConfiguration {
    
    private final Collection<EncryptTableRuleConfiguration> tables;
    
    private final Map<String, AlgorithmConfiguration> encryptors;
    
    @Override
    public Collection<String> getLogicTableNames() {
        return new CaseInsensitiveSet<>(tables.stream().map(EncryptTableRuleConfiguration::getName).collect(Collectors.toList()));
    }
}
