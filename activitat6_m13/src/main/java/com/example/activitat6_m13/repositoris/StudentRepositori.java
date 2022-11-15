package com.example.activitat6_m13.repositoris;

import com.example.activitat6_m13.entitats.Course;
import com.example.activitat6_m13.entitats.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepositori extends CrudRepository<Student, Long> {
}
