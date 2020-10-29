package com.bikash.university.models;

import java.util.Objects;

public class Course extends BaseEntity {
    private String name;
    private Double totalHours;

    public Course(String name, Double totalHours) {
        super();
        this.name = name;
        this.totalHours = totalHours;
    }

    public Course() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Double totalHours) {
        this.totalHours = totalHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return course.getId().equals(this.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalHours);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", totalHours=" + totalHours +
                ", id=" + id +
                '}';
    }
}
