package com.oocl.springboot.repository;

import com.oocl.springboot.modle.EmployeeRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRecordRepository extends JpaRepository<EmployeeRecord, Integer> {
}
