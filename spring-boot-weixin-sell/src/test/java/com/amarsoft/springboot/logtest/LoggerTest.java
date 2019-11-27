/** 
　 * Title: LoggerTest.java 
　 * Description: TODO(一句话描述这个方法的目的和作用)
　 * @author jiangshanwen 
　 * @date 2019年11月27日上午1:30:55 
　 * @version 1.0 
*/

package com.amarsoft.springboot.logtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.logging.impl.SLF4JLog;
/** 
 * @Title: 
 * @Description: （对类进行功能描述） 
 * @author jiangshanwen
 * @date: 2019年11月27日上午1:30:55 （日期） 
 * @version:v.1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration
@Slf4j
public class LoggerTest {
    @Test
	public  void loggerTest1() {
	        String name = "linxz";
	        String password = "123456";
	        log.debug("debug...");
	        log.info("name:{},password:{}", name, password);
	        log.error("error...");
	}

}
