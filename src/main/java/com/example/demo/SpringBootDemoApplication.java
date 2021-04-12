package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController // Makes the class serve rest endpoints
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @GetMapping // To specify Request, this is Get request
    public List<Student> hello(){
        return List.of(
                new Student(1L,
                        "Mariam",
                        "marian.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21)
        );
    }

}
