package com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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






}
