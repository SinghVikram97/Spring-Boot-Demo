package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Entity-Student
// ID type-Long
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
