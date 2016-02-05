package com.wang.springboot.mySpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wang.springboot.mySpringBoot.api.account.dao.AccountMapper;
import com.wang.springboot.mySpringBoot.api.account.domain.Account;

@RestController
@RequestMapping("/springboot")
public class HelloWorldController {

	@Autowired
	private AccountMapper accountDao;

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String sayWorld(@PathVariable("name") String name) {
		Account account = new Account("123", name, "asd.com", "123", true);
		accountDao.insert(account);
		return "Hello " + name;
	}
}
