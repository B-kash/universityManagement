package com.bikash.university.models;

import java.util.Objects;

public class Professor extends BaseEntity{
    private String name;
    private String email;
    private Course course;
    private JobType jobType;
    private String highestEducation;

    public Professor() {
        super();
    }

    public Professor(String name, String email, Course course, JobType jobType, String highestEducation) {
        super();
        this.name = name;
        this.email = email;
        this.course = course;
        this.jobType = jobType;
        this.highestEducation = highestEducation;
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return professor.getId().equals(this.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, course, jobType, highestEducation);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course=" + course +
                ", jobType=" + jobType +
                ", highestEducation='" + highestEducation + '\'' +
                ", id=" + id +
                '}';
    }
}
