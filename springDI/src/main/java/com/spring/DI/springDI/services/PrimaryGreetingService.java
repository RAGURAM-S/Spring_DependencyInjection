package com.spring.DI.springDI.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreetings() {
		// TODO Auto-generated method stub
		return "Hello World!! - Primary Bean";
	}

	
}
