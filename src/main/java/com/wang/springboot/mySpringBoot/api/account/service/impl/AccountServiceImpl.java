package com.wang.springboot.mySpringBoot.api.account.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wang.springboot.mySpringBoot.api.account.dao.AccountMapper;
import com.wang.springboot.mySpringBoot.api.account.domain.Account;
import com.wang.springboot.mySpringBoot.api.account.domain.AccountCriteria;
import com.wang.springboot.mySpringBoot.api.account.service.AccountService;
import com.wang.springboot.mySpringBoot.base.dao.BaseDao;
import com.wang.springboot.mySpringBoot.base.service.BaseServiceImpl;

@Service
public class AccountServiceImpl extends BaseServiceImpl<Account, AccountCriteria> implements AccountService {

	private static final Log logger = LogFactory.getLog(AccountServiceImpl.class);

	@Autowired
	private AccountMapper accountDao;

	@Override
	protected BaseDao<Account, AccountCriteria, String> getDao() {
		return accountDao;
	}

	/*
	 * (非 Javadoc) <p>Title: transactionTest</p> <p>Description: </p>
	 * 
	 * @see com.wang.springboot.mySpringBoot.api.account.service.AccountService#
	 * transactionTest()
	 */
	@Override
	public void transactionTest(Account account) {
		create(account);
		int i = 0;
		System.out.println(5 / i);
		account.setId(null);
		create(account);
	}

	/*
	 * (非 Javadoc) <p>Title: aopTest</p> <p>Description: </p>
	 * 
	 * @see com.wang.springboot.mySpringBoot.api.account.service.AccountService#
	 * aopTest()
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void aopTest() {
		logger.info("==AOP test==");
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void aopTest2() {
		logger.info("==AOP test2==");
		aopTest();
	}

}
