package com.figpop.bestpractices.profile.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {

	HelloBean(@Value("${helloMessage}") String helloMessage) {
		System.out.println(helloMessage);
	}
}
