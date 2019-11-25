/** 
　 * Title: Consumer.java 
　 * Description: TODO(一句话描述这个方法的目的和作用)
　 * @author jiangshanwen 
　 * @date 2019年11月24日下午3:01:12 
　 * @version 1.0 
*/

package com.amarsoft.springboot.client;

import java.util.Map;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/** 
 * @Title: Consumer
 * @Description:消费者 （对类进行功能描述） 
 * @author jiangshanwen
 * @date: 2019年11月24日下午3:01:12 （日期） 
 * @version:v.1.0
 */
@Component
public class Consumer {
     
	@JmsListener(destination="amarsoft")
	public void resdMessage(String text){
		System.out.println("接收到消息："+text);
	}
	@JmsListener(destination="amarsoft1")
	public void resdMapMessage(Map text){
		System.out.println("接收到消息："+text);
	}
}
