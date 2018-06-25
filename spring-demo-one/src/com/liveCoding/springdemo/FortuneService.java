package com.liveCoding.springdemo;

public interface FortuneService {
	
	
	
	//Constructor Injection  - Development Process
	
	// 1- Define the depenedncy construction and class
	// a - HappyFortune Serivce is a class     b- FortunceService is a interface (End of step 1). 
	//2- Create a constructor in your class for injections
	//3- Configure the dependency injectin in spring class
	public String getFortune();

}
