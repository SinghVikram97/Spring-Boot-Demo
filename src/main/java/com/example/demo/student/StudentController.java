package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController // Makes the class serve rest endpoints
@RequestMapping(path="api/v1/student") // Specify path etc. for this endpoint
public class StudentController {
    @GetMapping // To specify Request, this is Get request
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Mariam",
                        "marian.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21)
        );
    }
}
