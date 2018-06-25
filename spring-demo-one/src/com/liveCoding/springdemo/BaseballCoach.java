package com.liveCoding.springdemo;

public class BaseballCoach implements Coach {

	
	//Create a constructor in your class for injections
	
	// define a private field for the dependency
	private FortuneService fortuneService;

	// constructur for dependency injections
	public BaseballCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in Battin practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fotuneService to get a fortune - making use of dependency
		return fortuneService.getFortune();
	}
}
