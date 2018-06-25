package com.liveCoding.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//setter Injection - Spring Development

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuaration file applicationContext.xm
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean(Java Object) from Spring Container
		SoccerCoach theCoach = context.getBean("mySoccerCoach", SoccerCoach.class);

		// call the method to print it out
		System.out.println(theCoach.getDailyWorkout());
		// call fortune Service Method
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
