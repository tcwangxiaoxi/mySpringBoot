package com.wang.springboot.mySpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wang.springboot.mySpringBoot.listener.MyApplicationEnvironmentPreparedEventListener;
import com.wang.springboot.mySpringBoot.listener.MyApplicationFailedEventListener;
import com.wang.springboot.mySpringBoot.listener.MyApplicationPreparedEventListener;
import com.wang.springboot.mySpringBoot.listener.MyApplicationStartedEventListener;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application extends SpringBootServletInitializer {

	private static Logger log = LoggerFactory.getLogger(Application.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		log.info(
				"=======================Application.addListener(application.application());==================================");
		Application.addListener(application.application());

		return application;
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		Application.addListener(app);
		app.run(args);
	}

	private static void addListener(SpringApplication app) {

		// spring boot启动开始时执行的事件
		app.addListeners(new MyApplicationStartedEventListener());
		// spring boot 对应Enviroment已经准备完毕，但此时上下文context还没有创建
		app.addListeners(new MyApplicationEnvironmentPreparedEventListener());
		// spring boot上下文context创建完成，但此时spring中的bean是没有完全加载完成的
		app.addListeners(new MyApplicationPreparedEventListener());
		// spring boot启动异常时执行事件
		app.addListeners(new MyApplicationFailedEventListener());
	}

}
