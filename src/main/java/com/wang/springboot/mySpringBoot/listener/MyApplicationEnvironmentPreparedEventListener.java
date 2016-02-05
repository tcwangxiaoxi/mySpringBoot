/**   
* @Title: MyApplicationEnvironmentPreparedEventListener.java 
* @Package com.wang.springboot.mySpringBoot.listener 
* @Description: TODO(用一句话描述该文件做什么) 
* @author River.W   
* @date 2016年2月4日 下午4:01:13 
* @version V1.0   
*/
package com.wang.springboot.mySpringBoot.listener;

import java.util.Iterator;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

/**
 * @ClassName: MyApplicationEnvironmentPreparedEventListener
 * @Description: 配置环境事件监听（spring boot 对应Enviroment已经准备完毕，但此时上下文context还没有创建）。
 *               在该监听中获取到ConfigurableEnvironment后可以对配置信息做操作，例如：修改默认的配置信息，
 *               增加额外的配置信息等等~~~
 * @Company:
 * @author River.W
 * @date 2016年2月4日 下午4:01:13
 * 
 */
public class MyApplicationEnvironmentPreparedEventListener
		implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {

		ConfigurableEnvironment envi = event.getEnvironment();
		MutablePropertySources mps = envi.getPropertySources();

		System.out.println("==Starting MyApplicationEnvironmentPreparedEventListener==");

		if (mps != null) {
			Iterator<PropertySource<?>> iter = mps.iterator();
			while (iter.hasNext()) {
				PropertySource<?> ps = iter.next();
				System.out.println("====ps.getName:" + ps.getName() + ";ps.getSource:" + ps.getSource()
						+ ";ps.getClass:" + ps.getClass());
			}
		}

		System.out.println("==Ending MyApplicationEnvironmentPreparedEventListener==");
	}

}
