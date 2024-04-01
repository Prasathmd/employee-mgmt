package com.demo.ems.controller;

import com.demo.ems.model.Employees;
import com.demo.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //create post method to add employee
    @PostMapping("/create")
    public String addEmployee(@RequestBody Employees employees) {
        System.out.println("inside the add employee method");
        employeeService.addEmployee(employees);
        return "Employee Created Successfully. id = " + employees.getId();
    }

    //create a get method to get employee by id
    @GetMapping("/employee/{id}")
    public Employees getEmployeeById(@PathVariable Integer id) {
        System.out.println("the input value for edit employee ="+id);
        return employeeService.getEmployeeById(id);
    }

    //create a put method to update employee by id
    @PutMapping("/updateEmployee/{id}")
    public Employees updateEmployee(@PathVariable Integer id, @RequestBody Employees employees) {
        System.out.println("the input value for edit employee ="+id);
        return employeeService.updateEmployee(id, employees);
    }

}
