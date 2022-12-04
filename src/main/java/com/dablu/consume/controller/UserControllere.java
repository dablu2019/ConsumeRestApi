package com.dablu.consume.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class UserControllere {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Welcome to spring boot application";
		
	}
	@GetMapping(value="/callhello")
	private String callApi() {
		String uri="http://localhost:8585/hello";
		RestTemplate restTemplate=new RestTemplate();
		String result=restTemplate.getForObject(uri, String.class);
		return result;
		
	}
	
	@GetMapping(value="/callextApi")
	private String callexternalApi() {
		String uri1="https://jsonplaceholder.typicode.com/users/1";
		RestTemplate restTemplate=new RestTemplate();
		String result1=restTemplate.getForObject(uri1, String.class);
		return result1;
		
	}
	@GetMapping(value="/callexternalApi")
	private String externalApi() {
		String uri2="https://run.mocky.io/v3/7f11b9d3-1401-4a38-9dde-51c49a73db3c";
		RestTemplate restTemplate=new RestTemplate();
		String result2=restTemplate.getForObject(uri2, String.class);
		return result2;
		
	}

}
