package com.example.api.service;

import com.example.api.entity.Student;
import com.example.api.repository.StudentRepository;
import com.example.api.response.SameEmailException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> listStudent(){
        return studentRepository.findAll();
    }

    public void add(Student student) {
        if(studentRepository.findStudentByEmail(student.getEmail()).isPresent()){
            throw new SameEmailException("User with this email alresdy exsist");
        }
        studentRepository.save(student);
    }

    public void delete(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    public void update(Student student) {
        Optional<Student> row = studentRepository.findById(student.getId());
        if(row.isPresent()){
            Student item = row.get();
            if(!student.getName().isEmpty()){
                item.setName(student.getName());
            }
            if(student.getDate() != null){
                item.setDate(student.getDate());
            }
            studentRepository.save(item);
        }
    }
}
