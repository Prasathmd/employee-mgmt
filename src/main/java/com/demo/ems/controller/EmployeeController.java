package com.demo.ems.controller;

import com.demo.ems.model.Employees;
import com.demo.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/hello")
    public String getEmployee() {
        return "Hello World";
    }

    //create a getAllEmployee service which will return a list of Employee
    @GetMapping("/employees")
    public List<Employees> getAllEmployee() {
        System.out.println("inside the get All Employee method");
        //create a dummy employee object and return it
        List<Employees> employeeList= employeeService.getAllEmployee();
        System.out.println("employeeList = " + employeeList);
        return employeeList;

    }

}
