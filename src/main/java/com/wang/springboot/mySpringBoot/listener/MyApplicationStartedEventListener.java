package com.wang.springboot.mySpringBoot.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @ClassName: MyApplicationStartedEventListener
 * @Description: spring boot 启动监听类（spring boot启动开始时执行的事件）。
 *               在该事件中可以获取到SpringApplication对象，可做一些执行前的设置
 * @Company:
 * @author River.W
 * @date 2016年2月4日 下午3:51:57
 * 
 */
public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

	/*
	 * (非 Javadoc) <p>Title: onApplicationEvent</p> <p>Description: </p>
	 * 
	 * @param event
	 * 
	 * @see
	 * org.springframework.context.ApplicationListener#onApplicationEvent(org.
	 * springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		SpringApplication app = event.getSpringApplication();
		app.setShowBanner(false);// 不显示banner信息
		System.out.println("==MyApplicationStartedEventListener==");
	}
}
