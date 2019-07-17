package com.oocl.springboot.controller;

import com.oocl.springboot.modle.EmployeeRecord;
import com.oocl.springboot.repository.EmployeesRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeesRecordController {
    @Autowired
    private EmployeesRecordRepository employeesRecordRepository;

    @GetMapping("/employeeRecords")
    public List<EmployeeRecord> findAll() {
        return employeesRecordRepository.findAll();
    }

    @PostMapping("/employeeRecords")
    public EmployeeRecord createCompany(@RequestBody EmployeeRecord company) {
        return employeesRecordRepository.save(company);
    }

    @GetMapping("/employeeRecords/{recordId}")
    public Optional<EmployeeRecord> findCompanyById(@PathVariable Integer recordId) {
        return employeesRecordRepository.findById(recordId);
    }

    @PutMapping("/employeeRecords/{recordId}")
    public EmployeeRecord updateCompany(@PathVariable Integer recordId, @RequestBody EmployeeRecord employeeRecord) {
        employeeRecord.setRecordId(recordId);
        return employeesRecordRepository.save(employeeRecord);
    }

    @DeleteMapping("/employeeRecords/{recordId}")
    public void deleteCompany(@PathVariable Integer recordId) {

        EmployeeRecord employeeRecord = new EmployeeRecord();
        employeeRecord.setRecordId(recordId);
        employeesRecordRepository.delete(employeeRecord);
    }

}
