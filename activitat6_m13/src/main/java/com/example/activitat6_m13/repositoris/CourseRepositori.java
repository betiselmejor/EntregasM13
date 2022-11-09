package com.example.activitat6_m13.repositoris;

import com.example.activitat6_m13.entitats.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepositori extends CrudRepository<Course, Long> {

}
