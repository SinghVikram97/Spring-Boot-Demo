package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Makes the class serve rest endpoints
@RequestMapping(path="api/v1/student") // Specify path etc. for this endpoint
public class StudentController {

    private final StudentService studentService;

    @Autowired // https://stackoverflow.com/questions/3153546/how-does-autowiring-work-in-spring
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping // To specify Request, this is Get request
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        // @RequestBody take it and map it into a student
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id){
        studentService.deleteStudent(id);
    }

}
