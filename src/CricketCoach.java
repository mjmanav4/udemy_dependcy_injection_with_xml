package com.manavjain.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("coach mail");
		this.emailAddress = emailAddress;
	}


	private String team;
	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("cricket team");
		this.team = team;
	}


	
	
	public CricketCoach() {
		System.out.println("cricket constructor");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricket setter method");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
