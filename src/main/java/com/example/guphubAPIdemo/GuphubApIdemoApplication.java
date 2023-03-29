package com.example.guphubAPIdemo;

import com.example.guphubAPIdemo.model.Student;
import com.example.guphubAPIdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class GuphubApIdemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GuphubApIdemoApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public  void run(String... args) throws Exception{
		Student student=new Student();
		student.setFName("Saul");
		student.setLName("Goodman");
		student.setDate("11-20-2001");
		student.setUserName("The Real SaulyG");
		student.setPassword("sadj;dsa;");
		studentRepository.save(student);
	}

}

