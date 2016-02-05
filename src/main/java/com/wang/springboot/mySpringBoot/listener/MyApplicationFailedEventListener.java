/**   
* @Title: MyApplicationFailedEventListener.java 
* @Package com.wang.springboot.mySpringBoot.listener 
* @Description: TODO(用一句话描述该文件做什么) 
* @author River.W   
* @date 2016年2月4日 下午4:36:34 
* @version V1.0   
*/
package com.wang.springboot.mySpringBoot.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @ClassName: MyApplicationFailedEventListener
 * @Description: spring boot启动异常时执行事件
 * @Company:
 * @author River.W
 * @date 2016年2月4日 下午4:36:34
 * 
 */
public class MyApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {

	@Override
	public void onApplicationEvent(ApplicationFailedEvent event) {
		System.out.println("==Starting MyApplicationFailedEventListener==");

		Throwable throwable = event.getException();
		handleThrowable(throwable);

		System.out.println("==Ending MyApplicationFailedEventListener==");
	}

	/* 处理异常 */
	private void handleThrowable(Throwable throwable) {

		System.out.println("====" + throwable.getMessage() + "====");

	}

}
