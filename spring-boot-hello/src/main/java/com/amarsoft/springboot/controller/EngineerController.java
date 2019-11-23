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

import org.apache.commons.logging.Log;
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
    private static int i=0;
	@Resource
	private EngineerService engineerService;

	/**
	 * 
	 * @Title: save
	 * @Description:新增加工程师
	 * @date :2019年11月23日下午4:35:53 @return
	 */
	@RequestMapping("/save")
	public String save() {
		Engineer engineer = new Engineer("JSW001", 27, "male", "P8", new Date());
		engineerService.save(engineer);
		return "save ok!";
	}

	@RequestMapping("/v1.0/new/save1")
	@ResponseBody
	public String save1() {
		i += 1;
		Engineer engineer = new Engineer("JSW00"+i, 27+i, "male", "P8", new Date());
		engineerService.save(engineer);
		return "save ok!";
	}

	/**
	 * 
	 * @Title: findEngineerById
	 * @Description:根据id查询工程师
	 * @date :2019年11月23日下午5:06:08 @param id @return 直接返回List，自动转化为JSON格式
	 */
	@GetMapping(value = "/v1.0/findById/{id}", produces = "application/json;charset=UTF-8")
	public Engineer findEngineerById(@PathVariable int id) {
		return engineerService.findById(id);
	}

	/**
	 * 
	 * @Title: queryUserById
	 * @Description:根据id查询工程师
	 * @date :2019年11月23日下午9:38:02 @param id @return
	 */
	@GetMapping(value = "/v1.0/queryEngineerById/{id}", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ResponseEntity<Engineer> queryEngineerById(@PathVariable("id") int id) {
		try {//     /engineer/v3.0/new/findByLikeName/
			Engineer user = this.engineerService.findById(id);
//			int i=1/0;
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
	/**
	 * 直接返回List，自动转化为JSON格式 
	  * @Title: foo6 
	  * @Description:根据名称查询列表
	  * @date :2019年11月23日下午11:57:41
	　 * @param name
	　 * @return
	 */
	 
	@GetMapping(value = "/v1.0/findByName/{name}", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public List<Engineer> findByName(@PathVariable("name") String name) {//   /engineer/v1.0/new/
		// 可以使用teamname获取url路径分隔
		// 获取请求的参数
		List<Engineer> engineerList = engineerService.findByName(name);
		return engineerList;
	}
	/**
	 * 
	  * @Title: foo6 
	  * @Description:根据用户名模糊查询 
	  * @date :2019年11月23日下午11:59:09
	　 * @param name
	　 * @return
	 */
	@GetMapping(value = "/v1.0/findByLikeName/{name}", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public List<Engineer> findByLikeName(@PathVariable("name") String name) {//   /engineer/v1.0/new/
		// 可以使用teamname获取url路径分隔
		List<Engineer> engineerList = engineerService.findByLikeName(name);
		return engineerList;
	}

	/**
	  * 
	  * @Title: findByLikeName 
	  * @Description:根据用户名模糊查询
	  * @date :2019年11月23日下午10:45:35
	　 * @param name
	　 * @return
	 */
//	@GetMapping(value = "/v3.0/new/findByLikeName/{name}",produces="application/json;charset=UTF-8")
//	@ResponseBody 
//	public ResponseEntity<List<Engineer>> findByLikeName1(@PathVariable("name") String name) {
//		//可以使用teamname获取url路径分隔
//		//获取请求的参数
////		String engineerName = request.getParameter("name");
//		try{
//			ResponseEntity<List<Engineer>> engineerList = (ResponseEntity<List<Engineer>>) engineerService.findByLikeName(name);
//		    if(0==((List<Engineer>) engineerList).size()){
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//		}
//			return (ResponseEntity<List<Engineer>>) ResponseEntity.ok();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//	}
}
