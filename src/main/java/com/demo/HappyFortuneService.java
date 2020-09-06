package com.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Method called from HAPPY fortune service implementation class.";
	}

}
