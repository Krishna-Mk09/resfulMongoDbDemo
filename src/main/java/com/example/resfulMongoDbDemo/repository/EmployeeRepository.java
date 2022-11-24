package com.example.resfulMongoDbDemo.repository;

import com.example.resfulMongoDbDemo.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// The above code is a repository class which is used to perform CRUD operations on the Employee collection.
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

    /**
     * Find all employees with the given name.
     *
     * @param EmployeeName The name of the employee you want to find.
     * @return A list of employees with the name EmployeeName.
     */
    List<Employee> findByEmployeeName(String EmployeeName);

    /**
     * It returns an Employee object whose email id is equal to the given email id
     *
     * @param employeeEmailId The email id of the employee.
     * @return Employee object
     */
    Employee findByEmployeeEmailId(String employeeEmailId);


    /**
     * Find all employees whose department name is in the list of department names
     *
     * @param departmentName The name of the department.
     * @return List of Employee
     */
    @Query("{'dept.departmentName':{$in:[?0]}}")
    List<Employee> findAllEmployeeDepartmentName(String departmentName);
}
