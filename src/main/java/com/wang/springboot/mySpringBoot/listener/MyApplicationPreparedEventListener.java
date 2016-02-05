/**   
* @Title: MyApplicationPreparedEventListener.java 
* @Package com.wang.springboot.mySpringBoot.listener 
* @Description: TODO(用一句话描述该文件做什么) 
* @author River.W   
* @date 2016年2月4日 下午4:19:00 
* @version V1.0   
*/
package com.wang.springboot.mySpringBoot.listener;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName: MyApplicationPreparedEventListener
 * @Description: 上下文创建完成后执行的事件监听器（spring
 *               boot上下文context创建完成，但此时spring中的bean是没有完全加载完成的）。
 *               在获取完上下文后，可以将上下文传递出去做一些额外的操作, 在该监听器中是无法获取自定义bean并进行操作的。
 * @Company:
 * @author River.W
 * @date 2016年2月4日 下午4:19:00
 * 
 */
public class MyApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationPreparedEvent event) {

		System.out.println("==Starting MyApplicationPreparedEventListener==");

		ConfigurableApplicationContext cac = event.getApplicationContext();
		passContextInfo(cac);
		System.out.println("==Ending MyApplicationPreparedEventListener==");
	}

	/**
	 * 传递上下文
	 * 
	 * @param cac
	 */
	private void passContextInfo(ApplicationContext cac) {
		// 在该监听器中是无法获取自定义bean并进行操作的。
		System.out.println(
				"====cac.getBeanDefinitionNames : " + StringUtils.join(cac.getBeanDefinitionNames(), ",") + "==");
	}

}
