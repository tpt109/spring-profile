package com.figpop.bestpractices.profile.bean;

import javax.annotation.PostConstruct;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ProfileScannerBean {

	private Environment environment;

	  ProfileScannerBean(Environment environment) {
	    this.environment = environment;
	  }

	  @PostConstruct
	  void postConstruct(){
	    String[] activeProfiles = environment.getActiveProfiles();
	    //logger.info("active profiles: {}", Arrays.toString(activeProfiles));
	    
	    System.out.println("profile active :" + activeProfiles.length);
	  }
}
