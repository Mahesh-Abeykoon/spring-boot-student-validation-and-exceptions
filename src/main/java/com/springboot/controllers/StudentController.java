package com.springboot.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dtos.StudentRequestDTO;
import com.springboot.entities.Student;
import com.springboot.services.StudentService;

@RestController
public class StudentController {
    

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/students")
    public List<Student> getAllStudents(){

        return studentService.getStudents();
    }


    @PostMapping(path = "/new/student")
    public Student saveStudent(@RequestBody @Valid StudentRequestDTO studentRequest ){
        return studentService.saveStudent(studentRequest);
    }

    



}
