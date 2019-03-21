package com.example.democrudapp.democrudapp.student;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String passportNumber;



}
