package com.tcs.mywebservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Web Service";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!!!";
	}
}
