package com.springDemo;

public class BaseballCoach implements Coach {
	
	//private firld for dependency
	private FortuneService fs;
	
	
	public BaseballCoach() {
		
	}
	//constructor for dependency injection
	public BaseballCoach(FortuneService tfs) {
		fs=tfs;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 5 min on a dribble";
	}

	@Override
	public String getDailyForutne() {
		
		return fs.getFortune();
	}

}
