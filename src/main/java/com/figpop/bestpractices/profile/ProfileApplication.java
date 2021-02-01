package com.figpop.bestpractices.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileApplication {

	public static void main(String[] args) {
		
		//SpringApplication.run(ProfileApplication.class, args);
		
		SpringApplication application = 
			      new SpringApplication(ProfileApplication.class);
			    //application.setAdditionalProfiles("foo");
			    //application.setAdditionalProfiles("bar");
			    application.run(args);
	}

}
