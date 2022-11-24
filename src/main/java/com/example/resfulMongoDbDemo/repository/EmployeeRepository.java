package com.example.resfulMongoDbDemo.repository;

import com.example.resfulMongoDbDemo.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

    List<Employee> findByEmployeeName(String EmployeeName);

    Employee findByEmployeeEmailId(String employeeEmailId);


    @Query("{'dept.departmentName':{$in:[?0]}}")
    List<Employee> findAllEmployeeDepartmentName(String departmentName);
}
