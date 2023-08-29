package com.thevarungupta.springgraphqlapi.request;

import lombok.Data;

@Data
public class CreateSubjectRequest {
    private String subjectName;
    private Double marksObtained;
}
