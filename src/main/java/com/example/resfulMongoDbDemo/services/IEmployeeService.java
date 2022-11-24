/*
 * Author Name : M.Krishna.
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.example.resfulMongoDbDemo.services;

import com.example.resfulMongoDbDemo.domain.Employee;

import java.util.List;

// This is the interface for the service layer.
public interface IEmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployee();

    List<Employee> getAllEmployeeByName(String employeeName);

    List<Employee> getAllEmployeeByDepartmentName(String departmentName);

    Employee getAllEmployeeByEmail(String employeeEmailId);
}
