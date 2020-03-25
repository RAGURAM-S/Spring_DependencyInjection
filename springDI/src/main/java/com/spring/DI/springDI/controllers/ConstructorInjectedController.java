package com.spring.DI.springDI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.DI.springDI.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;

//	Autowired not really necessary for ConstructorInjectedController 
	@Autowired
	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreetings();
	}
}
