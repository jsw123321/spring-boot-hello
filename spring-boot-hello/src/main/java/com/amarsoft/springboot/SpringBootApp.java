package com.amarsoft.springboot;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
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
	
	
	
	public static void main(String[] args) {
		//SpringApplication.run(SpringBootApp.class, args);
		new SpringApplicationBuilder(SpringBootApp.class).run(args);
	}
}
