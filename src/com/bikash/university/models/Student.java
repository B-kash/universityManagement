package com.bikash.university.models;

import java.util.List;
import java.util.Objects;

public class Student extends BaseEntity {

    private String name;
    private String email;
    private Integer rollNumber;
    private Double phoneNumber;
    private List<Course> courses;

    public Student() {
        super();
    }

    public Student(String name, String email, Integer rollNumber, Double phoneNumber, List<Course> courses) {
        super();
        this.name = name;
        this.email = email;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return student.getId().equals(this.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, rollNumber, phoneNumber, courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollNumber=" + rollNumber +
                ", phoneNumber=" + phoneNumber +
                ", courses=" + courses +
                ", id=" + id +
                '}';
    }
}
