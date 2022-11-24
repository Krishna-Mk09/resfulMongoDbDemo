/*
 * Author Name : M.Krishna.
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.example.resfulMongoDbDemo.services;

import com.example.resfulMongoDbDemo.domain.Employee;
import com.example.resfulMongoDbDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> getAllEmployeeByName(String employeeName) {
        return employeeRepository.findByEmployeeName(employeeName);
    }

    @Override
    public List<Employee> getAllEmployeeByDepartmentName(String departmentName) {
        return employeeRepository.findAllEmployeeDepartmentName(departmentName);
    }

    @Override
    public Employee getAllEmployeeByEmail(String employeeEmailId) {
        return employeeRepository.findByEmployeeEmailId(employeeEmailId);
    }
}
