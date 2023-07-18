package com.example.Student.Student.Service;

import com.example.Student.Student.Entity.Student;
import com.example.Student.Student.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Override
    public void studentAdd(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public List<Student> findAllStudentsBySchool(Integer schoolId) {
        return this.studentRepository.findAllBySchoolId(schoolId);
    }

}
