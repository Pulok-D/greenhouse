package com.hostel.greenhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.greenhouse.model.Employee;
import com.hostel.greenhouse.repository.EmployeeRepository;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository empRepository;

    // CREATE
    public Employee createEmployee(Employee emp) {
        return empRepository.save(emp);
    }

    // READ
    public List<Employee> getEmployees() {
        return empRepository.findAll();
    }

    // READ by ID
    // public List<Employee> getEmployeesbyId(Long empId) {
    //     return empRepository.findById(empId).get();
    // }
    public Employee getEmployeesById(Long empId) {
        return empRepository.findById(empId).get();
     }
    // DELETE
    public void deleteEmployee(Long empId) {
        empRepository.deleteById(empId);
    }

    // UPDATE
    public Employee updateEmployee(Long empId, Employee employeeDetails) {
        Employee emp = empRepository.findById(empId).get();
        emp.setFirstName(employeeDetails.getFirstName());
        emp.setLastName(employeeDetails.getLastName());
        emp.setEmailId(employeeDetails.getEmailId());

        return empRepository.save(emp);
    }
}
