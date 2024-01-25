package com.demo.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.beans.Student;
import com.demo.dao.StudentRepository;

@Service
public class StudentService {

 @Autowired
 private StudentRepository studentRepository;

 public List<Student> getAllStudents() {
     return studentRepository.findAll();
 }

 public Optional<Student> getStudentById(Long id) {
     return studentRepository.findById(id);
 }

 public Student saveStudent(Student student) {
     return studentRepository.save(student);
 }

 public void deleteStudent(Long id) {
     studentRepository.deleteById(id);
 }

 public Student updateStudent(Long id, Student updatedStudent) {
     if (studentRepository.existsById(id)) {
         updatedStudent.setId(id);
         return studentRepository.save(updatedStudent);
     }
     return null;
 }
}

