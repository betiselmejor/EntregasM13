package com.example.activitat6_m13.controlador;


import com.example.activitat6_m13.entitats.Course;
import com.example.activitat6_m13.entitats.Student;
import com.example.activitat6_m13.repositoris.StudentRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/studentsAPI")
public class StudentController {
    @Autowired
    StudentRepositori studentRep;

    /*TOTS ELS STUDENTS*/ @GetMapping("students")
    public List<Student> getCourses(){
        return (List<Student>) studentRep.findAll();

    }
}
