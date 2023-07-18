package com.example.Student.Student.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private int id;
    @Column(name = "studentName")
    private String studentName;
    @Column(name = "studentLastName")
    private String studentLastName;
    @Column(name = "schoolId")
    private int schoolId;

    public Student(int id, String studentName, String studentLastName, int schollId) {
        this.id = id;
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.schoolId = schollId;
    }
    public Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }
}
