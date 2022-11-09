package com.example.activitat6_m13.controlador;


import com.example.activitat6_m13.entitats.Course;
import com.example.activitat6_m13.entitats.CourseMaterial;
import com.example.activitat6_m13.repositoris.CourseMaterialRepo;
import com.example.activitat6_m13.repositoris.CourseRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class CourseController {
    @Autowired
    CourseRepositori courseRep;

    @Autowired
    CourseMaterialRepo courseMat;


    /*TOTS ELS CURSOS*/ @GetMapping("cursos")
    public List<Course> getCourses(){
        return (List<Course>) courseRep.findAll();

    }


    /*UN CURS PER ID*/ @GetMapping("cursos/curs/{id}")
    public Course getCourseById(@PathVariable long id){
        Course course1 = courseRep.findById(id).get();

        return course1;

    }

    /*TOTS CURS MATERIAL*/@GetMapping("cursos/materials")
    public List<CourseMaterial> getCourseMaterials(){
        return (List<CourseMaterial>) courseMat.findAll();
    }
    /*UN CURS PER ID*/ @GetMapping("cursos/material/{id}")
    public CourseMaterial getMaterialById(@PathVariable long id){
        CourseMaterial course1 = courseMat.findById(id).get();

        return course1;

    }

}
