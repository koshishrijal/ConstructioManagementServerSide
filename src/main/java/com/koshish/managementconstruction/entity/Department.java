package com.koshish.managementconstruction.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="department_id")
    private int departmentId;
    @Column(name="name")
    private String name;
    @Column(name="pay_rate")
    private int payRate;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name="date_added")
    private Date dateAdded;
    @Column(name="date_modified",nullable = true)
    private Date dateModified;

    public Department() {
    }

    public Department(String name, int payRate, Date dateAdded, Date dateModified) {
        this.name = name;
        this.payRate = payRate;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
}
