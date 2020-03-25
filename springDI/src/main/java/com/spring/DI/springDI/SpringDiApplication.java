package com.spring.DI.springDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.DI.springDI.controllers.ConstructorInjectedController;
import com.spring.DI.springDI.controllers.I18nController;
import com.spring.DI.springDI.controllers.MyController;
import com.spring.DI.springDI.controllers.PropertyInjectedController;
import com.spring.DI.springDI.controllers.SetterInjectedController;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);
		
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println("************** I18NBean **************");
		System.out.println(i18nController.sayHello() + "\n");

		MyController myController = (MyController) context.getBean("myController");
		System.out.println("************** PrimaryBean **************");
		System.out.println(myController.sayHello() + "\n");
		
		System.out.println("************** PropertyInjectedController **************");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting() + "\n");
		
		System.out.println("************** SetterInjectedController **************");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting() + "\n");
		
		System.out.println("************** ConstructorInjectedController **************");
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
