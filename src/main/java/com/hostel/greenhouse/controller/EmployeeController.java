package com.hostel.greenhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hostel.greenhouse.model.Employee;
import com.hostel.greenhouse.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    EmployeeService empService;

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee emp) {
        return empService.createEmployee(emp);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> readEmployees() {
        return empService.getEmployees();
    }

    @RequestMapping(value = "/employees/{empId}", method = RequestMethod.GET)
    public Employee readEmployeesById(@PathVariable(value = "empId") Long empId) {
        return empService.getEmployeesById(empId);
    }

    @RequestMapping(value = "/employees/{empId}", method = RequestMethod.PUT)
    public Employee readEmployees(@PathVariable(value = "empId") Long id, @RequestBody Employee empDetails) {
        return empService.updateEmployee(id, empDetails);
    }

    @RequestMapping(value = "/employees/{empId}", method = RequestMethod.DELETE)
    public void deleteEmployees(@PathVariable(value = "empId") Long id) {
        empService.deleteEmployee(id);
    }

}
