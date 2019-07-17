package com.oocl.springboot.controller;

import com.oocl.springboot.modle.Employee;
import com.oocl.springboot.repository.EmployeesRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeesController {
    @Autowired
    public EmployeesRepostory employeesRepostory;

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeesRepostory.save(employee);
    }

    @GetMapping("/employees/{employeeId}")
    public Optional<Employee> findById(@PathVariable Integer employeeId) {
        return employeesRepostory.findById(employeeId);
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeesRepostory.findAll();
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteById(@PathVariable Integer employeeId) {
        Employee employee = new Employee();
        employee.setId(employeeId);
        employeesRepostory.delete(employee);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable Integer employeeId, @RequestBody Employee employee) {
        employee.setId(employeeId);
        return employeesRepostory.save(employee);
    }

    @GetMapping(value = "/employees", params = "ageMini")
    public List<Employee> findAgeAbove(@RequestParam int ageMini) {
        return employeesRepostory.findByAgeGreaterThan(ageMini);
    }



}
