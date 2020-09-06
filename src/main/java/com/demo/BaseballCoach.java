package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public String getDailyWorkout() {
		return "This is my daily workout by Baseball Coach";
	}

	public String getFortune() {
		return fortuneService.getFortune();
	}

	// constructor injection using annotation

	// @Autowired --> optional since spring 4.3
	/*
	 * an @Autowired annotation on such a constructor is no longer necessary if the
	 * target bean only defines one constructor to begin with. However, if several
	 * constructors are available, at least one must be annotated to teach the
	 * container which one to use.
	 */
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
		System.out.println("Baseball coach default constructor called.");
	}

	// setter injection using annotation

	// @Autowired --> optional
	/*
	 * public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	// Random method injection
	/*
	 * @Autowired public void sampleMethod(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService;
	 * System.out.println("Sample method invoked."); }
	 */

}
