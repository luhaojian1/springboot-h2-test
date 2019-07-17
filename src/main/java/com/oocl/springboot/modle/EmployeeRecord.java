package com.oocl.springboot.modle;

import javax.persistence.*;

@Entity
@Table(name = "employee_record")
public class EmployeeRecord {
    @Id
    @GeneratedValue
    private int recordId;

    private String description;

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
