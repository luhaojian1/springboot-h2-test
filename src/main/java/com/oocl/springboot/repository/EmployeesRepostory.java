package com.oocl.springboot.repository;

import com.oocl.springboot.modle.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeesRepostory extends JpaRepository<Employee, Integer> {

    List<Employee> findByAgeGreaterThan(Integer age);

}
