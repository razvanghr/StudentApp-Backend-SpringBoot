package com.razvanghr.studentsystem.controller;
import com.razvanghr.studentsystem.model.Student;
import com.razvanghr.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student added";
    }

    @DeleteMapping("/remove/{studentId}")
    public String remove(@PathVariable Integer studentId){
        studentService.deleteStudent(studentId);
        return "Student removed";
    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/get/{studentId}")
    public Student getStudentId(@PathVariable Integer studentId){
        return studentService.getStudentId(studentId);
    }

}
