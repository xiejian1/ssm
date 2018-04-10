/**
 * 
 */
package com.cdut.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdut.mapper.UserDao;

/**
 * @author xieqiang-daye
 *
 */
@Service
public class IndexService {
	
	@Autowired
	private UserDao userDao;
	
   public void queryAll(){
	   System.out.println("Hello world!");
	   try {
		List<Map<String,Object>> users = userDao.queryUser();
		for(int i=0;i<users.size();i++){
			Map<String,Object> map = users.get(i);
			System.out.println("username:" + map.get("username"));
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
