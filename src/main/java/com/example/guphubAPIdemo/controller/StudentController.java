package com.example.guphubAPIdemo.controller;


import com.example.guphubAPIdemo.execption.ResourceNotFoundExecption;
import com.example.guphubAPIdemo.model.Student;
import com.example.guphubAPIdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/studentinfo/v1/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;



    @GetMapping("/getStudents")
    public  List<Student> getAllStudents() {
        return studentRepository.findAll();
    }



    @PostMapping("/addStudent")
     Student createStudent(@RequestBody Student student){
        System.out.println("sent successfully");
        System.out.println(student.toString());
        return studentRepository.save(student);

    }


    @GetMapping("getUserID {id}")
    public ResponseEntity<Student> getEmployeeById(@PathVariable  long id){
        Student employee = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundExecption("Employee not exist with id:" + id));
        return ResponseEntity.ok(employee);
    }

    // build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Student> updateEmployee(@PathVariable long id,@RequestBody Student employeeDetails) {
        Student updateEmployee = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundExecption("Employee not exist with id: " + id));

        updateEmployee.setFName(employeeDetails.getFName());
        updateEmployee.setLName(employeeDetails.getLName());
        updateEmployee.setDate(employeeDetails.getDate());
        updateEmployee.setUserName(employeeDetails.getUserName());
        updateEmployee.setPassword(employeeDetails.getPassword());
        updateEmployee.setStudentID(employeeDetails.getStudentID());

        studentRepository.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }

    // build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){

        Student employee = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundExecption("Employee not exist with id: " + id));

        studentRepository.delete(employee);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}

