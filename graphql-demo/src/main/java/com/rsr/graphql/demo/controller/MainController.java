package com.rsr.graphql.demo.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsr.graphql.demo.request.SampleRequest;


@RestController
public class MainController {


	// get all
	@QueryMapping("sample")
	public SampleRequest getFullName(@Argument String firstName, @Argument String lastName) {

		return SampleRequest.builder().firstName(firstName).lastName(lastName).build();
	}

}
