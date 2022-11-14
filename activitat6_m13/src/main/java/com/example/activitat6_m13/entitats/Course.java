package com.example.activitat6_m13.entitats;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Course {
    @Id
    @Column(name = "Course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
    private List<CourseMaterial> materials;

    public Course() {
    }

    public Course(long id, String title, List<CourseMaterial> materials) {
        this.id = id;
        this.title = title;
        this.materials = materials;
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
