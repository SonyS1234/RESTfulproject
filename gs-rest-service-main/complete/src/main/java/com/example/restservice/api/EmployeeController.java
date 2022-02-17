package com.example.restservice.api;

import com.example.restservice.model.*;
import com.example.restservice.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {

    //GET
    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        EmployeeService service = new EmployeeService();
        return service.getAllEmployees();
    }

    //I want to use the same route => (/pet) but I want to send an id to filter the data
    //PathVariable
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        EmployeeService service = new EmployeeService();
        List<Employee> employees = service.getAllEmployees();
        //Lambda expression
        for(Employee p : employees){
            if (p.getId() == id){
                return p;
            }
        }
        return null;

    }

    //POST
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        EmployeeService service = new EmployeeService();
        service.addEmployee(employee);
        return employee;
    }
}