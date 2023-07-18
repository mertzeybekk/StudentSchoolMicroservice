package com.example.Student.Student.Service;

import com.example.Student.Student.Entity.Student;

import java.util.List;

public interface StudentService {
    public void studentAdd(Student student);
    public List<Student> findAllStudents();

    public List<Student> findAllStudentsBySchool(Integer schoolId);
}
