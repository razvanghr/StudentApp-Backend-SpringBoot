package com.razvanghr.studentsystem.service;

import com.razvanghr.studentsystem.model.Student;
import com.razvanghr.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer studentId){
        studentRepository.deleteById(studentId);
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }


    public Student getStudentId(Integer studentId) {
        return studentRepository.getById(studentId);
    }





}
