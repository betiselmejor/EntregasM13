package com.example.activitat6_m13.entitats;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class CourseMaterial {

    @Id
    @Column(name = "CourseMaterial_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String url;


    @JsonIgnore
    @ManyToOne(optional = true)
    private Course course;


    public CourseMaterial(long id, String url, Course course) {
        this.id = id;
        this.url = url;
        this.course = course;
    }

    public CourseMaterial() {
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public void removeCourse(){
        course=null;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
