package com.example.crud.entity;
import jakarta.persistence.*;

@Entity
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long employeeID;

    private String employeeName;

    private float employeeSalary;

    public Employee(){

    }

    public Employee(float employeeSalary, String employeeName, Long employeeID) {
        this.employeeSalary = employeeSalary;
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    public Long getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getEmployeeSalary() {
        return employeeSalary;
    }
}
