/** 
　 * Title: JsonController.java 
　 * Description: TODO(一句话描述这个方法的目的和作用)
　 * @author jiangshanwen 
　 * @date 2019年11月21日下午11:06:26 
　 * @version 1.0 
*/

package com.amarsoft.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amarsoft.springboot.entity.Engineer;

/** 
 * @Title: JsonController01
 * @Description:测试返回值为json格式 
 * @author jiangshanwen
 * @date: 2019年11月21日下午11:06:26 （日期） 
 * @version:v.1.0
 *   @Controller和@ResponseBody组合使用等同于@RestController
 */
//@RestController
@Controller
@ResponseBody
public class JsonController01 {
	
    @RequestMapping("/getEngieer01")
	public Engineer getEngieer(){//   /getEngieer01
		Engineer engineer=new Engineer();
		engineer.setId(1);
		engineer.setName("曹操");
		engineer.setSex("male");
		engineer.setAge(100);
		engineer.setRank("p9");
		return engineer;
	}
}
