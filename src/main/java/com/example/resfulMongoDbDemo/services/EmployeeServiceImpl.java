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

    // This is a constructor injection.
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * The function takes an Employee object as an argument, saves it to the database, and returns the saved Employee
     * object
     *
     * @param employee The employee object that needs to be saved.
     * @return Employee
     */
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * > The function returns a list of all employees in the database
     *
     * @return A list of all employees
     */
    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    /**
     * > This function returns a list of employees whose name matches the employeeName parameter
     *
     * @param employeeName The name of the employee you want to search for.
     * @return A list of employees with the name that was passed in.
     */
    @Override
    public List<Employee> getAllEmployeeByName(String employeeName) {
        return employeeRepository.findByEmployeeName(employeeName);
    }

    /**
     * This function returns a list of employees by department name
     *
     * @param departmentName The name of the department whose employees you want to retrieve.
     * @return A list of employees that are in the department with the name that is passed in.
     */
    @Override
    public List<Employee> getAllEmployeeByDepartmentName(String departmentName) {
        return employeeRepository.findAllEmployeeDepartmentName(departmentName);
    }

    /**
     * It returns the employee object by email id.
     *
     * @param employeeEmailId The email id of the employee.
     * @return Employee object
     */
    @Override
    public Employee getAllEmployeeByEmail(String employeeEmailId) {
        return employeeRepository.findByEmployeeEmailId(employeeEmailId);
    }
}
