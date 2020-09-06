package com.demo;

import org.springframework.stereotype.Component;

@Component("myCoach")
public interface Coach {
	public String getDailyWorkout();

	public String getFortune();
}
