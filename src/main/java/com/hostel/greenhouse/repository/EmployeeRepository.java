package com.hostel.greenhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.greenhouse.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}