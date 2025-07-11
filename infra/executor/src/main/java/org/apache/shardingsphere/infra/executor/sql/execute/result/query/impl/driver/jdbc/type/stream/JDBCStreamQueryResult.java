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

package org.apache.shardingsphere.infra.executor.sql.execute.result.query.impl.driver.jdbc.type.stream;

import lombok.Getter;
import org.apache.shardingsphere.infra.exception.kernel.data.UnsupportedDataTypeConversionException;
import org.apache.shardingsphere.infra.exception.kernel.data.UnsupportedStreamCharsetConversionException;
import org.apache.shardingsphere.infra.executor.sql.execute.result.query.impl.driver.jdbc.metadata.JDBCQueryResultMetaData;
import org.apache.shardingsphere.infra.executor.sql.execute.result.query.type.stream.AbstractStreamQueryResult;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Optional;

/**
 * JDBC query result for stream loading.
 */
@Getter
public final class JDBCStreamQueryResult extends AbstractStreamQueryResult {
    
    private final ResultSet resultSet;
    
    private final boolean containsJDBCResultSet;
    
    public JDBCStreamQueryResult(final ResultSet resultSet) throws SQLException {
        this(resultSet, false);
    }
    
    public JDBCStreamQueryResult(final ResultSet resultSet, final boolean containsJDBCResultSet) throws SQLException {
        super(new JDBCQueryResultMetaData(resultSet.getMetaData()));
        this.resultSet = resultSet;
        this.containsJDBCResultSet = containsJDBCResultSet;
    }
    
    @Override
    public boolean next() throws SQLException {
        return resultSet.next();
    }
    
    @Override
    public Object getValue(final int columnIndex, final Class<?> type) throws SQLException {
        if (boolean.class == type) {
            return resultSet.getBoolean(columnIndex);
        }
        if (byte.class == type) {
            return resultSet.getByte(columnIndex);
        }
        if (short.class == type) {
            return resultSet.getShort(columnIndex);
        }
        if (int.class == type) {
            return resultSet.getInt(columnIndex);
        }
        if (long.class == type) {
            return resultSet.getLong(columnIndex);
        }
        if (float.class == type) {
            return resultSet.getFloat(columnIndex);
        }
        if (double.class == type) {
            return resultSet.getDouble(columnIndex);
        }
        if (String.class == type) {
            return resultSet.getString(columnIndex);
        }
        if (BigDecimal.class == type) {
            return resultSet.getBigDecimal(columnIndex);
        }
        if (byte[].class == type) {
            return resultSet.getBytes(columnIndex);
        }
        if (Date.class == type) {
            return resultSet.getDate(columnIndex);
        }
        if (Time.class == type) {
            return resultSet.getTime(columnIndex);
        }
        if (Timestamp.class == type) {
            return resultSet.getTimestamp(columnIndex);
        }
        if (Blob.class == type) {
            return resultSet.getBlob(columnIndex);
        }
        if (Clob.class == type) {
            return resultSet.getClob(columnIndex);
        }
        if (Array.class == type) {
            return resultSet.getArray(columnIndex);
        }
        if (ZonedDateTime.class == type) {
            return resultSet.getObject(columnIndex, type);
        }
        return resultSet.getObject(columnIndex);
    }
    
    @Override
    public Object getCalendarValue(final int columnIndex, final Class<?> type, @SuppressWarnings("UseOfObsoleteDateTimeApi") final Calendar calendar) throws SQLException {
        if (Date.class == type) {
            return resultSet.getDate(columnIndex, calendar);
        }
        if (Time.class == type) {
            return resultSet.getTime(columnIndex, calendar);
        }
        if (Timestamp.class == type) {
            return resultSet.getTimestamp(columnIndex, calendar);
        }
        throw new UnsupportedDataTypeConversionException(type, calendar).toSQLException();
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public InputStream getInputStream(final int columnIndex, final String type) throws SQLException {
        switch (type) {
            case "Ascii":
                return resultSet.getAsciiStream(columnIndex);
            case "Unicode":
                return resultSet.getUnicodeStream(columnIndex);
            case "Binary":
                return resultSet.getBinaryStream(columnIndex);
            default:
                throw new UnsupportedStreamCharsetConversionException(type).toSQLException();
        }
    }
    
    @Override
    public Reader getCharacterStream(final int columnIndex) throws SQLException {
        return resultSet.getCharacterStream(columnIndex);
    }
    
    @Override
    public boolean wasNull() throws SQLException {
        return resultSet.wasNull();
    }
    
    @Override
    public Optional<ResultSet> getJDBCResultSet() {
        return containsJDBCResultSet ? Optional.of(resultSet) : Optional.empty();
    }
    
    @Override
    public void close() throws SQLException {
        resultSet.close();
    }
}
