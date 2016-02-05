package com.wang.springboot.mySpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wang.springboot.mySpringBoot.listener.MyApplicationEnvironmentPreparedEventListener;
import com.wang.springboot.mySpringBoot.listener.MyApplicationFailedEventListener;
import com.wang.springboot.mySpringBoot.listener.MyApplicationPreparedEventListener;
import com.wang.springboot.mySpringBoot.listener.MyApplicationStartedEventListener;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		// spring boot启动开始时执行的事件
		app.addListeners(new MyApplicationStartedEventListener());
		// spring boot 对应Enviroment已经准备完毕，但此时上下文context还没有创建
		app.addListeners(new MyApplicationEnvironmentPreparedEventListener());
		// spring boot上下文context创建完成，但此时spring中的bean是没有完全加载完成的
		app.addListeners(new MyApplicationPreparedEventListener());
		// spring boot启动异常时执行事件
		app.addListeners(new MyApplicationFailedEventListener());
		
		app.run(args);
	}

}
