package com.figpop.bestpractices.profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.figpop.bestpractices.profile.bean.BarBean;

@Configuration
public class BaseConfiguration {

	@Bean
	@Profile("bar")
	BarBean barBean() {
		return new BarBean();
	}
}
