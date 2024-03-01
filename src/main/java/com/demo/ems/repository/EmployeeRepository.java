package com.demo.ems.repository;

import com.demo.ems.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Integer>{

}
