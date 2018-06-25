package com.liveCoding.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Constructor Injection  - Spring Development
public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuaration file applicationContext.xm
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean(Java Object) from Spring Container
		Coach theCoach = context.getBean("myCoach",Coach.class);


		// call the method to print it out
		System.out.println(theCoach.getDailyWorkout());
		
		//call fortune Service Method
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	
	}
}
