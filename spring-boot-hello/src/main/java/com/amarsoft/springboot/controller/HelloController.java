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
	 public String sayHello(){//有@ResponseBody，方法的返回值会写入HTTP response Body中
		 String str="hello world ,SpringBoot123!";
		 return str;
	 }
	 /**
	   * @Title: index 
	   * @Description:跳转到.ftl页面(FreeMarker Template Language)
	   * @date :2019年11月21日下午10:38:02
	   * @return String
	   */
	 @RequestMapping("/index")
	 public String index(){//没有@ResponseBody，方法的返回值会默认解析为 跳转的路径
		 String str="/index";
		 return str;
	 }
	 /**
	   * @Title: index1 测试热部署功能：新增加方法
	   * @Description:跳转到.ftl页面(FreeMarker Template Language)
	   * @date :2019年11月21日下午10:38:02
	   * @return String
	   */
	 @RequestMapping("/index1")
	 public String index1(){//没有@ResponseBody，方法的返回值会默认解析为 跳转的路径
		 String str="/index";
		 return str;
	 }
}
