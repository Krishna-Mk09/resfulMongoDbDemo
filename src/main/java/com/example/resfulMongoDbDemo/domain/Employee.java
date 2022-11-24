/*
 * Author Name : M.Krishna.
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.example.resfulMongoDbDemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * The `@Document` annotation tells Spring Data that this class is a document that can be stored in MongoDB
 */
@Document
public class Employee {
    // A primary key.
    @Id
    private int employeeId;
    private String employeeName;
    private String employeeEmailId;
    private Department dept;
    private List<Project> projects;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeEmailId, Department dept, List<Project> projects) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmailId = employeeEmailId;
        this.dept = dept;
        this.projects = projects;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmailId() {
        return employeeEmailId;
    }

    public void setEmployeeEmailId(String employeeEmailId) {
        this.employeeEmailId = employeeEmailId;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
