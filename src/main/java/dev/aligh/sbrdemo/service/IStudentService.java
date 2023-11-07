package dev.aligh.sbrdemo.service;

import dev.aligh.sbrdemo.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> geStudents();
    Student addStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student , Long id);
    void deleteStudent(Long id);
}
