package com.manavjain.springdemo;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run Track";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Track "+fortuneService.getFortune();
	}

}
