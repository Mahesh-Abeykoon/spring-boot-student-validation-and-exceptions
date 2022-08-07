package com.springboot.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dtos.StudentRequestDTO;
import com.springboot.entities.Student;
import com.springboot.services.StudentService;

@RestController
public class StudentController {
    

    @Autowired
    private StudentService studentService;

    //GetMapping for getting all Students details which are stored in the database
    @GetMapping(path = "/students")
    public List<Student> getAllStudents(){

        return studentService.getStudents();
    }

    //PostMapping for Posting Students details to the database.
    @PostMapping(path = "/new/student")
    public Student saveStudent(@RequestBody @Valid StudentRequestDTO studentRequest ){
        return studentService.saveStudent(studentRequest);
    }

    //GetMapping {id} for Getting some specific Student Detail which are stored in the getStudebt
    @GetMapping(path = "/students/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PutMapping(path = "/students/{id}")
    public Student updateStudentById(@PathVariable Long id, @RequestBody StudentRequestDTO studentRequest){
        return studentService.updateStudent(id, studentRequest);
    }





}
