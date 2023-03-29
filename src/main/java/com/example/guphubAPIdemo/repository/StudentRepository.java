package com.example.guphubAPIdemo.repository;

import com.example.guphubAPIdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    //all of the CRUD METHODS ARE HERE
}
