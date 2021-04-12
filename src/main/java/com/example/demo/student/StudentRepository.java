package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Entity-Student
// ID type-Long
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    // Query method will transform into an sql as SELECT * FROM student WHERE email='?'
    // Or we can annotate it

    // @Query("SELECT s FROM Student s WHERE s.email=?1")  // This Student is our entity/class not table, can specify query like this or
    // Query method below
    Optional<Student> findStudentByEmail(String email);

}
