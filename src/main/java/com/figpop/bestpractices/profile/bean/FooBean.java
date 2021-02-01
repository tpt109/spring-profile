package com.figpop.bestpractices.profile.bean;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("foo")
public class FooBean {

	@PostConstruct
	void postConstruct() {
		System.out.println("load food");
	}
}
