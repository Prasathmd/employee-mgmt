package com.demo.ems.service;

import com.demo.ems.model.Employees;
import com.demo.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employees> getAllEmployee() {
        System.out.println("inside the get All Employee method");
        List<Employees> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    public Employees addEmployee(Employees employees) {
        System.out.println("inside the add employee method");
        Employees savedEmployee = employeeRepository.save(employees);
        System.out.println("savedEmployee id = " + savedEmployee.getId());
        return savedEmployee;
    }
}
