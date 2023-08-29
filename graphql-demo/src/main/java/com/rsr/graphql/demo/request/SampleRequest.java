package com.rsr.graphql.demo.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class SampleRequest {
	
	private String firstName;
	private String lastName;

}
