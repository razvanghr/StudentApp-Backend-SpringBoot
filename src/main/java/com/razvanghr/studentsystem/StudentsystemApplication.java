package com.razvanghr.studentsystem;

import com.razvanghr.studentsystem.model.Student;
import com.razvanghr.studentsystem.repository.StudentRepository;
import com.razvanghr.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsystemApplication.class, args);
	}



}
