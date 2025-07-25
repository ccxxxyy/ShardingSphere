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

package org.apache.shardingsphere.proxy.backend.firebird.handler.transaction;

import org.apache.shardingsphere.infra.exception.core.ShardingSpherePreconditions;
import org.apache.shardingsphere.proxy.backend.handler.tcl.TransactionalErrorAllowedSQLStatementHandler;
import org.apache.shardingsphere.sql.parser.statement.core.statement.SQLStatement;
import org.apache.shardingsphere.sql.parser.statement.core.statement.type.tcl.CommitStatement;
import org.apache.shardingsphere.sql.parser.statement.core.statement.type.tcl.RollbackStatement;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

/**
 * Transactional error allowed SQL statement handler of Firebird.
 */
public final class FirebirdTransactionalErrorAllowedSQLStatementHandler implements TransactionalErrorAllowedSQLStatementHandler {
    
    @Override
    public void judgeContinueToExecute(final SQLStatement statement) throws SQLException {
        ShardingSpherePreconditions.checkState(statement instanceof CommitStatement || statement instanceof RollbackStatement,
                () -> new SQLFeatureNotSupportedException("Current transaction is aborted, commands ignored until end of transaction block."));
    }
    
    @Override
    public String getDatabaseType() {
        return "Firebird";
    }
}
