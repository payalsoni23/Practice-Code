package com.demo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	public String getFortune() {
		return "Method called from SAD fortune service implementation class.";
	}

}
