package com.oocl.springboot.modle;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String gender;
    private int age;
    private int salary;
    @OneToOne
    @JoinColumn(name = "employeeId")
    private EmployeeRecord employeeRecord;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmployeeRecord getEmployeeRecord() {
        return employeeRecord;
    }

    public void setEmployeeRecord(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
