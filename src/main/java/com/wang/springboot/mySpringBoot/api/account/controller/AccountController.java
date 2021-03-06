package com.wang.springboot.mySpringBoot.api.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wang.springboot.mySpringBoot.api.account.domain.Account;
import com.wang.springboot.mySpringBoot.api.account.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String sayWorld(@PathVariable("name") String name) {
		Account account = new Account(null, name, "asd.com", "123", true);
		accountService.transactionTest(account);
		return "Hello15" + name;
	}

	@RequestMapping(value = "create/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String create(@PathVariable("name") String name) {
		Account account = new Account(null, name, "asd.com", "123", true);
		accountService.create(account);
		// aop();
		return "create:" + name;
	}

	@RequestMapping(value = "aop", method = RequestMethod.GET)
	@ResponseBody
	public String aop() {
		accountService.aopTest2();
		return "ok";
	}
}
