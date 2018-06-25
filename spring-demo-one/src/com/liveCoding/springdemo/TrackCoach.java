package com.liveCoding.springdemo;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	
	//default constructor
	
	public TrackCoach() {}
	//constructor - dependence injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run hard 5k miles";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Always keep confidence in yourself" +fortuneService.getFortune();
	}

}
