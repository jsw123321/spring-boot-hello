/** 
　 * Title: JsonController.java 
　 * Description: TODO(一句话描述这个方法的目的和作用)
　 * @author jiangshanwen 
　 * @date 2019年11月21日下午11:06:26 
　 * @version 1.0 
*/

package com.amarsoft.springboot.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amarsoft.springboot.bean.Engineer;

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
	//produces="application/json;charset=UTF-8"解决json格式数据返回值中文乱码
    @RequestMapping(value="/getEngieer01",produces="application/json;charset=UTF-8")
	public Engineer getEngieer(){//   /getEngieer01
		Engineer engineer=new Engineer();
		engineer.setId(1);
		engineer.setName("曹操11");
		engineer.setSex("male");
		engineer.setAge(100);
		engineer.setRank("p9");
		engineer.setCreatetime(new Date());
		return engineer;
	}
}
