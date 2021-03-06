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

package com.vecna.dbDiff.hibernate.testmodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Test model
 * @author greg.zheng@vecna.com
 */
@Entity
@Table(name="book")
class Book {

  private Long m_id;
  private String m_title;
  private boolean m_published;

  @Id @GeneratedValue
  public Long getId() {
    return m_id;
  }

  public void setId(Long id) {
    m_id = id;
  }

  public String getTitle() {
    return m_title;
  }

  public void setTitle(String title) {
    m_title = title;
  }

  public boolean isPublished() {
    return m_published;
  }

  public void setPublished(boolean published) {
    m_published = published;
  }

}