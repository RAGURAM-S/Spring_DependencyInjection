package com.spring.DI.springDI.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.DI.springDI.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.greetingService = new ConstructorGreetingService();
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
		fail("Not yet implemented");
	}

}
