package com.thevarungupta.springgraphqlapi.response;

import com.thevarungupta.springgraphqlapi.entity.Subject;

public class SubjectResponse {
    private Long id;
    private String subjectName;
    private Double marksObtained;

    public SubjectResponse(Subject subject){
        this.id = subject.getId();
        this.subjectName = subject.getSubjectName();
        this.marksObtained = subject.getMarksObtained();
    }
}
