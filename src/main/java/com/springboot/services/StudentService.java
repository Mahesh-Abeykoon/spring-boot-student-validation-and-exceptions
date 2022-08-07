package com.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dtos.StudentRequestDTO;
import com.springboot.entities.Student;
import com.springboot.repositories.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    public List <Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student saveStudent(StudentRequestDTO studentRequest){
        Student student = Student.builder()
            .name(studentRequest.getName())
            .age(studentRequest.getAge())
            .guardian(studentRequest.getGuardian())
            .mobile(studentRequest.getMobile())
            .build();
       return  studentRepository.save(student);
    }

    


}
