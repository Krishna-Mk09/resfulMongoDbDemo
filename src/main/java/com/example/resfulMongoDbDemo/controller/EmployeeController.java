/*
 * Author Name : M.Krishna.
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.example.resfulMongoDbDemo.controller;

import com.example.resfulMongoDbDemo.domain.Employee;
import com.example.resfulMongoDbDemo.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    private final IEmployeeService iEmployeeService;

    @Autowired
    public EmployeeController(IEmployeeService iEmployeeService) {
        this.iEmployeeService = iEmployeeService;
    }

    @PostMapping("saveEmployee")
    public ResponseEntity<?> saveFunction(@RequestBody Employee employee) {
        return new ResponseEntity<>(iEmployeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAllEmployee")
    public ResponseEntity<?> fetchAllEmployeeFunction() {
        return new ResponseEntity<>(iEmployeeService.getAllEmployee(), HttpStatus.CREATED);
    }

    @GetMapping("fetchEmployeeByName/{employeeName}")
    public ResponseEntity<?> fetchAllEmployeeByNameFunction(@PathVariable String employeeName) {
        return new ResponseEntity<>(iEmployeeService.getAllEmployeeByName(employeeName), HttpStatus.CREATED);
    }

    @GetMapping("fetchEmployeeByEmail/{employeeEmailId}")
    public ResponseEntity<?> fetchAllEmployeeByEmailFunction(@PathVariable String employeeEmailId) {
        return new ResponseEntity<>(iEmployeeService.getAllEmployeeByEmail(employeeEmailId), HttpStatus.CREATED);
    }

    @GetMapping("fetchEmployeeByDepartmentName/{departmentName}")
    public ResponseEntity<?> fetchAllEmployeeByDepartmentNameFunction(@PathVariable String departmentName) {
        return new ResponseEntity<>(iEmployeeService.getAllEmployeeByDepartmentName(departmentName), HttpStatus.CREATED);
    }
}
