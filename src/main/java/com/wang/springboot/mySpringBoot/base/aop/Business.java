/**   
* @Title: Business.java 
* @Package com.wang.springboot.mySpringBoot.base.aop 
* @Description: TODO(用一句话描述该文件做什么) 
* @author River.W   
* @date 2016年2月6日 下午10:58:40 
* @version V1.0   
*/
package com.wang.springboot.mySpringBoot.base.aop;

/**
 * @ClassName: Business
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Company:
 * @author River.W
 * @date 2016年2月6日 下午10:58:40
 * 
 */
public class Business implements IBusiness, IBusiness2 {

	@Override
	public boolean doSomeThing() {
		System.out.println("执行业务逻辑");
		return true;
	}

	@Override
	public void doSomeThing2() {
		System.out.println("执行业务逻辑2");
	}

}
