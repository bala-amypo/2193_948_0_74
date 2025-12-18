package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.studentEntity;

public interface studentService {

    List<studentEntity> getAllStudents();

    studentEntity addStudent(studentEntity student);
}