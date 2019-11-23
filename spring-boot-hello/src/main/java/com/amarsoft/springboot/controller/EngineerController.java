/** 
　 * Title: EngineerController.java 
　 * Description: TODO(一句话描述这个方法的目的和作用)
　 * @author jiangshanwen 
　 * @date 2019年11月23日下午3:32:05 
　 * @version 1.0 
*/

package com.amarsoft.springboot.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amarsoft.springboot.bean.Engineer;
import com.amarsoft.springboot.service.EngineerService;

/** 
 * @Title: EngineerController
 * @Description: 软件开发工程师的增删改查的controller
 * @author jiangshanwen
 * @date: 2019年11月23日下午3:32:05 （日期） 
 * @version:v.1.0
 */
@RestController
@RequestMapping("/engineer")
public class EngineerController {
      
	@Resource
	private EngineerService engineerService;
	
	/**
	  * 
	  * @Title: save 
	  * @Description:新增加工程师
	  * @date :2019年11月23日下午4:35:53
	　 * @return
	 */
	@RequestMapping("/save")
	public String save(){
		Engineer engineer=new Engineer("JSW001",27,"male","P8",new Date());
		engineerService.save(engineer);
		return "save ok!";
	}
	
	@RequestMapping("/v1.0/new/save1")
	@ResponseBody
	public String save1(){
		Engineer engineer=new Engineer("JSW001",27,"male","P8",new Date());
		engineerService.save(engineer);
		return "save ok!";
	}
	/**
	  * 
	  * @Title: findEngineerById 
	  * @Description:根据id查询工程师
	  * @date :2019年11月23日下午5:06:08
	　 * @param id
	　 * @return 直接返回List，自动转化为JSON格式
	 */
	@GetMapping(value="/v1.0/new/findById/{id}",produces="application/json;charset=UTF-8")
	public Engineer findEngineerById(@PathVariable int  id){
		return engineerService.findById(id);
	}
	/*
	 * 直接返回List，自动转化为JSON格式
	 */
	@GetMapping(value = "/v1.0/new/{name}",produces="application/json;charset=UTF-8")
    @ResponseBody 
    public List<Engineer> foo6(@PathVariable("name") String name) {
        //可以使用teamname获取url路径分隔
        //获取请求的参数
        List<Engineer> engineerList = engineerService.findByName(name);
        return engineerList;
    }
	
	@GetMapping(value = "/v1.0/new/queryUserById/{id}",produces="application/json;charset=UTF-8")
    @ResponseBody
    public ResponseEntity<Engineer> queryUserById(@PathVariable("id") int id) {
	        try {
	        	Engineer user = this.engineerService.findById(id);
	            if (null == user) {
	                // 资源不存在，响应404
	                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	            }
	            // 资源存在，响应200
	            // return ResponseEntity.status(HttpStatus.OK).body(user);
	            return ResponseEntity.ok(user);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

	   }
	
//	@GetMapping(value = "/v3.0/new/{name}",produces="application/json;charset=UTF-8")
//	@ResponseBody 
//	public ResponseEntity<Engineer> findByName(@PathVariable("name") String name) {
//		//可以使用teamname获取url路径分隔
//		//获取请求的参数
////		String engineerName = request.getParameter("name");
//		List<Engineer> engineerList = engineerService.findByName(name);
//		return engineerList;
//	}
}
