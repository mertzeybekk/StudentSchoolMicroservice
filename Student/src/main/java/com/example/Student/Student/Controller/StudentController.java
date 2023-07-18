package com.example.Student.Student.Controller;

import com.example.Student.Student.Entity.Student;
import com.example.Student.Student.Service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @PostMapping("/add")
    public void studentAdd(@RequestBody Student student){
        this.studentService.studentAdd(student);
    }
    @GetMapping("/all")
    public List<Student> findAllStudents() {
        return (this.studentService.findAllStudents());
    }

    @GetMapping("/school/{school-id}")
    public List<Student> findAllStudents(
            @PathVariable("school-id") Integer schoolId
    ) {
        return (this.studentService.findAllStudentsBySchool(schoolId));
    }
}
