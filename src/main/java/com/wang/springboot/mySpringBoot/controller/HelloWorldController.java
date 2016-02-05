package com.wang.springboot.mySpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class HelloWorldController {

	@Autowired
	private Long myLong2;

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String sayWorld(@PathVariable("name") String name) {
		return "Hello " + name + myLong2;
	}
}
