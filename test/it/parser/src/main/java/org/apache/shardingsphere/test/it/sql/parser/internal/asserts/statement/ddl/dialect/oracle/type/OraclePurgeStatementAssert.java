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

package org.apache.shardingsphere.test.it.sql.parser.internal.asserts.statement.ddl.dialect.oracle.type;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.sql.parser.statement.oracle.ddl.OraclePurgeStatement;
import org.apache.shardingsphere.test.it.sql.parser.internal.asserts.SQLCaseAssertContext;
import org.apache.shardingsphere.test.it.sql.parser.internal.asserts.segment.index.IndexAssert;
import org.apache.shardingsphere.test.it.sql.parser.internal.asserts.segment.table.TableAssert;
import org.apache.shardingsphere.test.it.sql.parser.internal.cases.parser.jaxb.statement.ddl.dialect.oracle.OraclePurgeStatementTestCase;

/**
 * Purge statement assert for Oracle.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OraclePurgeStatementAssert {
    
    /**
     * Assert analyze statement is correct with expected parser result.
     *
     * @param assertContext assert context
     * @param actual actual purge statement
     * @param expected expected purge statement test case
     */
    public static void assertIs(final SQLCaseAssertContext assertContext, final OraclePurgeStatement actual, final OraclePurgeStatementTestCase expected) {
        assertTables(assertContext, actual, expected);
        assertIndex(assertContext, actual, expected);
    }
    
    private static void assertTables(final SQLCaseAssertContext assertContext, final OraclePurgeStatement actual, final OraclePurgeStatementTestCase expected) {
        if (null != expected.getTable()) {
            TableAssert.assertIs(assertContext, actual.getTable(), expected.getTable());
        }
    }
    
    private static void assertIndex(final SQLCaseAssertContext assertContext, final OraclePurgeStatement actual, final OraclePurgeStatementTestCase expected) {
        if (null != expected.getIndex()) {
            IndexAssert.assertIs(assertContext, actual.getIndex(), expected.getIndex());
        }
    }
}
