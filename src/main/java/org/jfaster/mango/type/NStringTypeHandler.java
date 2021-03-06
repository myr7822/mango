/*
 * Copyright 2014 mango.jfaster.org
 *
 * The Mango Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.jfaster.mango.type;

import org.jfaster.mango.util.jdbc.JdbcType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Clinton Begin
 * @author ash
 */
public class NStringTypeHandler extends BaseTypeHandler<String> {

  @Override
  public void setNonNullParameter(PreparedStatement ps, int index, String parameter, JdbcType jdbcType)
      throws SQLException {
    ps.setNString(index, parameter);
  }

  @Override
  public String getNullableResult(ResultSet rs, int index)
      throws SQLException {
    return rs.getNString(index);
  }

  @Override
  public JdbcType getJdbcType() {
    return JdbcType.NVARCHAR;
  }

}
