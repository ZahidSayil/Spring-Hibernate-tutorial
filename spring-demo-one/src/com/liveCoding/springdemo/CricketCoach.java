package com.liveCoding.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//constructor - dependence injection
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Pitch the ball away from the batsman";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Keep your nerve and "+fortuneService.getFortune();
	}
}
