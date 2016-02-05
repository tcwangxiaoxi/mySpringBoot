package com.wang.springboot.mySpringBoot.api.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wang.springboot.mySpringBoot.api.account.dao.AccountMapper;
import com.wang.springboot.mySpringBoot.api.account.domain.Account;
import com.wang.springboot.mySpringBoot.api.account.domain.AccountCriteria;
import com.wang.springboot.mySpringBoot.api.account.service.AccountService;
import com.wang.springboot.mySpringBoot.base.dao.BaseDao;
import com.wang.springboot.mySpringBoot.base.service.BaseServiceImpl;

@Service
@Transactional
public class AccountServiceImpl extends BaseServiceImpl<Account, AccountCriteria> implements AccountService {

	@Autowired
	private AccountMapper accountDao;

	@Override
	protected BaseDao<Account, AccountCriteria, String> getDao() {
		return accountDao;
	}
	
}
