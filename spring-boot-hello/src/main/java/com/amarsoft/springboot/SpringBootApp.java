package com.amarsoft.springboot;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 
 * @Title: SpringBootApp
 * @Description: SpringBootApp入口启动类（对类进行功能描述） 
 * @author jiangshanwen
 * @date: 2019年11月22日上午12:23:29 （日期） 
 * @version:v.1.0
 */
@SpringBootApplication
public class SpringBootApp extends WebMvcConfigurerAdapter{
     /*
      * 配置fastJson消息转化器的第一种方法就是：
      *  （1）启动类继承extends WebMvcConfigurerAdapter
      *  SpringBootApp extends WebMvcConfigurerAdapter
      *  （2）覆盖方法configureMessageConverters
      *  @Override
	     public void configureMessageConverters...
      *
      */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converter){
		super.configureMessageConverters(converter);
		//1.需要先定义一个 convert 转换消息的对象;
		FastJsonHttpMessageConverter fastConverter=new FastJsonHttpMessageConverter();
		//2.添加fastJson 的配置信息，比如：是否要格式化返回的json数据;
		FastJsonConfig fastJsonConfig=new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		//3.在convert中添加配置信息.
		fastConverter.setFastJsonConfig(fastJsonConfig);
		converter.add(fastConverter);
	}
	
	/**
	  * 
	  * 配置fastJson消息转化器的第二种方法
	  * 
	  * 
	  */
//	public HttpMessageConverters fastJsonHttpMessageConverter(){
//		//1，定义一个convert转换消息对象
//		FastJsonHttpMessageConverter  fastConverter=new FastJsonHttpMessageConverter();
//		//2.添加fastJson的配置信息
//		FastJsonConfig fastJsonConfig=new FastJsonConfig();
//		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//		//3.在converter中添加配置信息
//		fastConverter.setFastJsonConfig(fastJsonConfig);
//		
//		HttpMessageConverter<?> converter=fastConverter;
//		return new HttpMessageConverters(converter);
//	}
	
	public static void main(String[] args) {
		final Logger  logger1=LoggerFactory.getLogger(SpringBootApp.class);
		logger1.debug("debug......");
		logger1.info("info...........");
		//SpringApplication.run(SpringBootApp.class, args);
		new SpringApplicationBuilder(SpringBootApp.class).run(args);
	}
	
	
	
	
}
