package com.example.activitat6_m13.entitats;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;




    private String title;

    @OneToMany(mappedBy = "course")
    private List<CourseMaterial> materials;

    public Course() {
    }

    public Course(long id, List<CourseMaterial> materials, String title) {
        this.id = id;
        this.materials = materials;
        this.title = title;
    }

    public Course(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CourseMaterial> getMaterials() {
        return materials;
    }

    public void setMaterials(List<CourseMaterial> materials) {
        this.materials = materials;
    }
}
