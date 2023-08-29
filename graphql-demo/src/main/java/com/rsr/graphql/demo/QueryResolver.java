package com.rsr.graphql.demo;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.rsr.graphql.demo.request.SampleRequest;

@Component
public class QueryResolver{
	
	public String firstQuery() {
		return "First Query";
	}
	
	public String secondQuery() {
		return "Second Query";
	}
	
	public SampleRequest getFullName(String firstName, String lastName) {
		
		return SampleRequest.builder()
				.firstName(firstName)
				.lastName(lastName).build();
	}

}
