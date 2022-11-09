package com.example.activitat6_m13.entitats;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class CourseMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String url;

    @JsonIgnore
    @ManyToOne
    private Course course;



    public CourseMaterial(Course course, String url) {
        this.course = course;
        this.url = url;
    }

    public CourseMaterial() {
    }

    public CourseMaterial(Course course, long id, String url) {
        this.course = course;
        this.id = id;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
