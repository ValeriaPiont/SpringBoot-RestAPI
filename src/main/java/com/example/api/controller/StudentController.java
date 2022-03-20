package com.example.api.controller;

import com.example.api.entity.Student;
import com.example.api.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/list")
    public List<Student> getAllStudents(){
        return studentService.listStudent();
    }

    @PostMapping(path = "/item")
    public void addStudent(@RequestBody Student student){
        studentService.add(student);
    }

    @DeleteMapping(path = "/item/{studentId}")
    public void removeStudent(@PathVariable Long studentId){
        studentService.delete(studentId);
    }

    @PutMapping(path = "/item")
    public void updateStudent(@RequestBody Student student){
        studentService.update(student);
    }
}

