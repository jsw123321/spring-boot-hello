/** 
　 * Title: QueueController.java 
　 * Description: TODO(一句话描述这个方法的目的和作用)
　 * @author jiangshanwen 
　 * @date 2019年11月24日下午2:51:00 
　 * @version 1.0 
*/
package com.amarsoft.springboot.controller;

import javax.annotation.Resource;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @Title: QueueController
 * @Description:消息队列控制器（对类进行功能描述） 
 * @author jiangshanwen
 * @date: 2019年11月24日下午2:51:00 （日期） 
 * @version:v.1.0
 */
@RestController
public class QueueController {
	
	   //jms消息队列模板
	   @Resource
	   private JmsMessagingTemplate  jmsMessagingTemplate;
        
	   @RequestMapping("/send")
	   public void send(String text){
		   //请求路劲：http://localhost:8080/send.do?text=jiangshanwen
		   jmsMessagingTemplate.convertAndSend("amarsoft", text);
	   }
	
}
