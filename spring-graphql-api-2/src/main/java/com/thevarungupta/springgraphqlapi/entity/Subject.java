package com.thevarungupta.springgraphqlapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Subject {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String subjectName;
    private double marksObtained;

    @ManyToOne()
    @JoinColumn(
            name = "student_id"
    )
    private Student student;
}
