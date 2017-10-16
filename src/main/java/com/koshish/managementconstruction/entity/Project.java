/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koshish.managementconstruction.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Koshish Rijal
 */
@Entity
@Table(name="tbl_project")
public class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="project_id")
    private int projectId;
    @Column(name="status")
    private boolean status;
    @Column(name="dateAdded",insertable = false)
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date dateAdded;
    @Column(name="amount")
    private double amount;
    
    @ManyToOne()
    @JoinColumn(name="tbl_order_order_id",referencedColumnName = "order_id")
    private Ordeer order;

    public Project() {
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ordeer getOrder() {
        return order;
    }

    public void setOrder(Ordeer order) {
        this.order = order;
    }
  
}
