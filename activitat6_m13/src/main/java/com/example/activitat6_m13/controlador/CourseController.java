package com.example.activitat6_m13.controlador;


import com.example.activitat6_m13.entitats.Course;
import com.example.activitat6_m13.entitats.CourseMaterial;
import com.example.activitat6_m13.repositoris.CourseMaterialRepo;
import com.example.activitat6_m13.repositoris.CourseRepositori;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.FetchType;
import java.util.List;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

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
        System.out.println(LAZY);


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

    /*BORRAR UN CURS PER ID*/@DeleteMapping("cursos/delete/{id}")
    public Course deleteCourseById(@PathVariable Long id){
        if(courseRep.existsById(id)){
            Course course_del = courseRep.findById(id).get();

            for (int i = 0; i < course_del.getMaterials().size(); i++) {
                course_del.getMaterials().get(i).removeCourse();

            }
            courseRep.deleteById(id);



            return course_del;

        }else{
            return null;
        }

    }

}
