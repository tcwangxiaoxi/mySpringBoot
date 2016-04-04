package com.wang.springboot.mySpringBoot.api.account.service;

import com.wang.springboot.mySpringBoot.api.account.domain.Account;
import com.wang.springboot.mySpringBoot.api.account.domain.AccountCriteria;
import com.wang.springboot.mySpringBoot.base.service.BaseService;

public interface AccountService extends BaseService<Account, AccountCriteria> {

	public void transactionTest(Account account);

	public void aopTest();
	
	public void aopTest2();

}
