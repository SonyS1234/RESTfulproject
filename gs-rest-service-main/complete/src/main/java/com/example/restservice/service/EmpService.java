package com.example.restservice.service;

import com.example.restservice.model.*;
import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;

import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeService {

    static List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees(){

        Employee emp1 = new Employee("Dan", "Bandana", 1, new Address(30, "Main Street", "H7H9H9"));
        Employee emp2 = new Employee("Steve", "Buscemi", 2, new Address(20, "Other Street", "H8H9H9"));
        Employee emp3 = new Employee("Bob", "Ross", 3, new Address(10, "Fake Street", "H9H9H9"));


        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}