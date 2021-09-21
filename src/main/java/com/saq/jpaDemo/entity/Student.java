package com.saq.jpaDemo.entity;

import javax.persistence.*;

@Entity
public class Student {

    @Id                    // primary key
    @GeneratedValue        // JPA will generate value for this
    private Long id;

    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    private Passport passport;

    protected Student() {            //JPA mandates a default constructor
    }

    public Student(String name) {        //No ID field in constructor as it's a @GeneratedValue from JPA
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {            //No setter for ID as it's a @GeneratedValue from JPA
        return id;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    /*@Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passport=" + passport +
                '}';
    }
}
