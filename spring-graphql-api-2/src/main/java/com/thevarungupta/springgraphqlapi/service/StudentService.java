package com.thevarungupta.springgraphqlapi.service;

import com.thevarungupta.springgraphqlapi.entity.Address;
import com.thevarungupta.springgraphqlapi.entity.Student;
import com.thevarungupta.springgraphqlapi.entity.Subject;
import com.thevarungupta.springgraphqlapi.repository.AddressRepository;
import com.thevarungupta.springgraphqlapi.repository.StudentRepository;
import com.thevarungupta.springgraphqlapi.repository.SubjectRepository;
import com.thevarungupta.springgraphqlapi.request.CreateStudentRequest;
import com.thevarungupta.springgraphqlapi.request.CreateSubjectRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private AddressRepository addressRepository;

    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    public Student createStudent(CreateStudentRequest createStudentRequest){
        Student student = new Student(createStudentRequest);

        Address address = new Address();
        address.setStreet(createStudentRequest.getStreet());
        address.setCity(createStudentRequest.getCity());

        address = addressRepository.save(address);
        student.setAddress(address);
        student = studentRepository.save(student);

        List<Subject> subjects = new ArrayList<>();
        if(createStudentRequest.getSubjects() != null){
            for(CreateSubjectRequest createSubjectRequest : createStudentRequest.getSubjects()){
                Subject subject = new Subject();
                subject.setSubjectName(createSubjectRequest.getSubjectName());
                subject.setMarksObtained(createSubjectRequest.getMarksObtained());
                subject.setStudent(student);
                subjects.add(subject);
            }
            subjectRepository.saveAll(subjects);
        }
        student.setSubjects(subjects);
        return student;

    }
}
