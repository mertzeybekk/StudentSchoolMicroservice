package com.example.School.School.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "scholl")
public class Scholl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "schollName")
    private String schollName;
    @Column(name = "schollEmail")
    private String schollEmail;

    public Scholl(int id, String schollName, String schollEmail) {
        this.id = id;
        this.schollName = schollName;
        this.schollEmail = schollEmail;
    }
    public Scholl(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchollName() {
        return schollName;
    }

    public void setSchollName(String schollName) {
        this.schollName = schollName;
    }

    public String getSchollEmail() {
        return schollEmail;
    }

    public void setSchollEmail(String schollEmail) {
        this.schollEmail = schollEmail;
    }
}
