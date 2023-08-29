package com.thevarungupta.springgraphqlapi.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.thevarungupta.springgraphqlapi.response.StudentResponse;
import com.thevarungupta.springgraphqlapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private StudentService studentService;

    public StudentResponse getStudent(Long id){
        return new StudentResponse(studentService.getStudentById(id));
    }
}
