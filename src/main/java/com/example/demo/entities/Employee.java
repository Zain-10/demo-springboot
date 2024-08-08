package com.example.demo.entitites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    private Long id;
    private String name;
    private String department;
    @Column(name = "hire_date")  // Maps the field to the database column 'hire_date'
    private LocalDate hireDate;

    public Employee(Long id, String name, String department, LocalDate hireDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.hireDate = hireDate;
    }

    public Employee() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
