package com.razvanghr.studentsystem.service;

import com.razvanghr.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public void deleteStudent(Integer studentId);

    List<Student> getAllStudents();

    public Student getStudentId(Integer studentId);


}
