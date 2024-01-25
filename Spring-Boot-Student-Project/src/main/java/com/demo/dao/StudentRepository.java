package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.beans.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

