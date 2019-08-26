package com.manavjain.springdemo;

public class BaseballCoach  implements Coach{

	
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spending 30 min practice";
	}
	
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
