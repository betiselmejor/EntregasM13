package com.example.activitat6_m13.entitats;


import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String lastName;

    private String firstName;

    private LocalDate birthDate;

    private boolean wantsNewsletter;

    @ManyToMany
    @JoinTable(
            name = "Course_Student",
            joinColumns = @JoinColumn(name = "Student_id"),
            inverseJoinColumns = @JoinColumn(name = "Course_id")
    )
    @JsonBackReference
    private List<Course> courses;

    public Student(long id, String lastName, String firstName, LocalDate birthDate, boolean wantsNewsletter, List<Course> courses) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.wantsNewsletter = wantsNewsletter;
        this.courses = courses;
    }

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isWantsNewsletter() {
        return wantsNewsletter;
    }

    public void setWantsNewsletter(boolean wantsNewsletter) {
        this.wantsNewsletter = wantsNewsletter;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


}
