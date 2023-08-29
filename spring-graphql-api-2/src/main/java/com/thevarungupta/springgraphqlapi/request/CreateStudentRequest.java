package com.thevarungupta.springgraphqlapi.request;

import lombok.Data;

import java.util.List;

@Data
public class CreateStudentRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String street;
    private String city;
    private List<CreateSubjectRequest> subjects;
}
