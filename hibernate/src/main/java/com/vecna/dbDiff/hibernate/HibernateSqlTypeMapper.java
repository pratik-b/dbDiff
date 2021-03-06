/**
 * Copyright 2011 Vecna Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License.  You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
*/

package com.vecna.dbDiff.hibernate;

import com.vecna.dbDiff.model.db.Column;

/**
 * This interface defines an API that should be implemented to map column data type between Hibernate and a database.
 *
 * @author greg.zheng@vecna.com
 */
public interface HibernateSqlTypeMapper {

  /**
   * @param column a database table column that is created from Hibernate mapping
   */
  public void mapType(final Column column);

}
