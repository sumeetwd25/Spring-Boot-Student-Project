package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.beans.Student;
import com.demo.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	 @Autowired
	    private StudentService studentService;

	    @GetMapping
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }

	    @GetMapping("/{id}")
	    public Optional<Student> getStudentById(@PathVariable Long id) {
	        return studentService.getStudentById(id);
	    }

	    @PostMapping
	    public Student saveStudent(@RequestBody Student student) {
	        return studentService.saveStudent(student);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteStudent(@PathVariable Long id) {
	        studentService.deleteStudent(id);
	    }

	    @PutMapping("/{id}")
	    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
	        return studentService.updateStudent(id, updatedStudent);
	    }
}
