package com.example.activitat6_m13.entitats;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
    private List<CourseMaterial> materials;


    @ManyToMany(mappedBy = "courses")
    @JsonManagedReference
    private List<Student> students;

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
