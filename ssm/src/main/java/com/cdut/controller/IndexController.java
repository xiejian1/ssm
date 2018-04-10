/**
 * 
 */
package com.cdut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdut.service.IndexService;

/**
 * @author xieqiang-daye
 *
 */
@Controller
public class IndexController {
  
	@Autowired
	private IndexService indexService;
	
	@RequestMapping("/index")
	public String hello(){
		indexService.queryAll();
		return "/index";
	}
} 
