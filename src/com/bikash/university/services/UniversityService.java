package com.bikash.university.services;

import com.bikash.university.models.Course;
import com.bikash.university.models.Professor;
import com.bikash.university.models.Student;

import java.util.List;
import java.util.UUID;

public interface UniversityService {
    //    Crud on Professor
    public Professor hire(Professor professor);
    public Professor fire(Professor professor);
    public Professor fire(UUID id);
    public List<Professor> listAllProfessors();
    public Professor updateProfessorInformation(Professor professor);
    public Professor getProfessor(UUID id);

    //    Crud on course
    public Course addCourse(Course course);
    public Course removeCourse(Course course);
    public Course removeCourse(UUID id);
    public List<Course> listAllCourses();
    public Course updateCourseInformation(Course course);
    public Course getCourse(UUID id);

    //    Crud on Student
    public Student addStudent(Student student);
    public Student removeStudent(Student student);
    public Student removeStudent(UUID id);
    public List<Student> listAllStudents();
    public Student updateStudentInformation(Student student);
    public Student getStudent(UUID id);
}
