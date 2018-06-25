package com.liveCoding.springdemo;


//setter injection

public class SoccerCoach implements Coach {
	
	
	private FortuneService fortuneService;
	//create a no -arg constructor
	
	public SoccerCoach() {
		System.out.println("SoccerCoach: inside a no-arg constructor");
	}
	
	//genternate getter and setters
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("SoccerCoach: inside a seter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
	
		return "Run hard and do leg workout daily ";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
