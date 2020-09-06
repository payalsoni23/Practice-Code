package com.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] data = { "Today is good day", "Today is bad day", "Today is lucky day" };
	private Random myRandom = new Random();

	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
