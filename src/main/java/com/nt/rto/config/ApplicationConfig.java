package com.nt.rto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {
	public ApplicationConfig() {
		System.out.println("ApplicationConfig.ApplicationConfig()");
		
	}
	
	@Bean
	public RestTemplate createRestTemplate() {
		RestTemplate restTemp=new RestTemplate();
		return restTemp;
	}

}
