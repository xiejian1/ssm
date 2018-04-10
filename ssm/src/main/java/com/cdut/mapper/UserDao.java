/**
 * 
 */
package com.cdut.mapper;

import java.util.List;
import java.util.Map;

/**
 * @author xieqiang-daye
 *
 */
public interface UserDao {
  public List<Map<String,Object>> queryUser() throws Exception;
}
