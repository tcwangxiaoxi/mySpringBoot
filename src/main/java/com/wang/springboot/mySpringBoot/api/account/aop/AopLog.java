/**   
* @Title: AopLog.java 
* @Package com.wang.springboot.mySpringBoot.api.account.aop 
* @Description: TODO(用一句话描述该文件做什么) 
* @author River.W   
* @date 2016年2月6日 下午1:35:51 
* @version V1.0   
*/
package com.wang.springboot.mySpringBoot.api.account.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

import com.wang.springboot.mySpringBoot.api.account.domain.Account;
import com.wang.springboot.mySpringBoot.api.account.service.impl.AccountServiceImpl;

/**
 * @ClassName: AopLog
 * @Description: Aop记录日志
 * @Company:
 * @author River.W
 * @date 2016年2月6日 下午1:35:51
 * 
 */
@Aspect
@Configuration
public class AopLog {

	private static final Log logger = LogFactory.getLog(AccountServiceImpl.class);

	@Pointcut("execution(* com.wang.springboot.mySpringBoot.base.service.BaseService.create(..)) && args(account)")
	public void paramsLog(Account account) {
	}

	@Pointcut("execution(public * com.wang.springboot.mySpringBoot.api.account.service.AccountService.aopTest*(..))")
	public void log() {
	}

	@Before("paramsLog(account)")
	public void beforeLog1(Account account) {
		logger.info("==starting1 create Account==");
		logger.info("==account.getName:" + account.getName() + "==");
	}

	@Before("log()")
	public void beforeLog2() {
		logger.info("==starting2 create Account==");
	}

	@AfterReturning("log()")
	public void afterLog() {
		logger.info("==ending create Account==");
	}

	@AfterThrowing("log()")
	public void throwLog() {
		logger.info("==throwing create Account==");
	}

	@After("log()")
	public void finishLog() {
		logger.info("==finish create Account==");
	}
}
