package com.spring.DI.springDI.controllers;

import org.springframework.stereotype.Controller;

import com.spring.DI.springDI.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreetings();
	}
}
