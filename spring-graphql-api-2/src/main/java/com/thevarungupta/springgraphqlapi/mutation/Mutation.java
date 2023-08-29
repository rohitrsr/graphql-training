package com.thevarungupta.springgraphqlapi.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.thevarungupta.springgraphqlapi.request.CreateStudentRequest;
import com.thevarungupta.springgraphqlapi.response.StudentResponse;
import com.thevarungupta.springgraphqlapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private StudentService studentService;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest){
        return new StudentResponse(studentService.createStudent(createStudentRequest));
    }
}
