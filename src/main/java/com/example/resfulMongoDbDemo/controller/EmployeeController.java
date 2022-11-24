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

/**
 * It's a REST controller class that contains all the endpoints for the Employee entity
 */
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    private final IEmployeeService iEmployeeService;

    // It's a constructor injection.
    @Autowired
    public EmployeeController(IEmployeeService iEmployeeService) {
        this.iEmployeeService = iEmployeeService;
    }

    /**
     * It takes an employee object as a parameter, saves it to the database, and returns the saved employee object
     *
     * @param employee The object that will be saved in the database.
     * @return A ResponseEntity object is being returned.
     */
    @PostMapping("saveEmployee")
    public ResponseEntity<?> saveFunction(@RequestBody Employee employee) {
        return new ResponseEntity<>(iEmployeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    /**
     * This function is used to fetch all the employees from the database
     *
     * @return ResponseEntity<?>
     */
    @GetMapping("/fetchAllEmployee")
    public ResponseEntity<?> fetchAllEmployeeFunction() {
        return new ResponseEntity<>(iEmployeeService.getAllEmployee(), HttpStatus.CREATED);
    }

    /**
     * This function is used to fetch all the employees by name
     *
     * @param employeeName The name of the employee you want to fetch.
     * @return ResponseEntity<?>
     */
    @GetMapping("fetchEmployeeByName/{employeeName}")
    public ResponseEntity<?> fetchAllEmployeeByNameFunction(@PathVariable String employeeName) {
        return new ResponseEntity<>(iEmployeeService.getAllEmployeeByName(employeeName), HttpStatus.CREATED);
    }

    /**
     * This function is used to fetch all the employees by their email id
     *
     * @param employeeEmailId This is the email id of the employee.
     * @return ResponseEntity<?>
     */
    @GetMapping("fetchEmployeeByEmail/{employeeEmailId}")
    public ResponseEntity<?> fetchAllEmployeeByEmailFunction(@PathVariable String employeeEmailId) {
        return new ResponseEntity<>(iEmployeeService.getAllEmployeeByEmail(employeeEmailId), HttpStatus.CREATED);
    }

    /**
     * This function fetches all the employees by department name
     *
     * @param departmentName The name of the department whose employees you want to fetch.
     * @return A list of employees
     */
    @GetMapping("fetchEmployeeByDepartmentName/{departmentName}")
    public ResponseEntity<?> fetchAllEmployeeByDepartmentNameFunction(@PathVariable String departmentName) {
        return new ResponseEntity<>(iEmployeeService.getAllEmployeeByDepartmentName(departmentName), HttpStatus.CREATED);
    }
}
