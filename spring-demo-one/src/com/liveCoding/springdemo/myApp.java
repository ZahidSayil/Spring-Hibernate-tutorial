package com.liveCoding.springdemo;

public class myApp {

	public static void main(String[] args) {
		
		//creating the object
		Coach theCoach = new TrackCoach();
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
