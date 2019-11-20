package com.amarsoft.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @Title:  * @Title: HelloController
 * @Description: say Hello 控制器 
 * @Description: （对类进行功能描述） 
 * @author jiangshanwen
 * @date: 2019年11月20日下午11:41:17 （日期） 
 * @version:v.1.0
 */
@Controller
@RequestMapping("/templates")
public class HelloController {
     /**
       * 
       * @Title: HelloController
       * @Description: say Hello 控制器 
       * @date :2019年11月20日下午11:32:15
       * @author jiangshanwen
       * @param  void
       * @return String
       */
	 @RequestMapping("/sayHello")
	 @ResponseBody
	 public String sayHello(){
		 String str="hello world ,SpringBoot!";
		 return str;
	 }
	 
	 @RequestMapping("/index")
	 public String index(){
		 String str="/index";
		 return str;
	 }
}
