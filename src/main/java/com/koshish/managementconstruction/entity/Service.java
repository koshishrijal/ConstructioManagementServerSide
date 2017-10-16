package com.koshish.managementconstruction.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="tbl_service")
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="service_id")
    private int serviceId;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="date_added")
    private Date dateAdded;
    @Column(name="status")
    private boolean status;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "service")
    @JsonBackReference
    private List<Ordeer>  ordeerList;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Ordeer> getOrdeerList() {
        return ordeerList;
    }

    public void setOrdeerList(List<Ordeer> ordeerList) {
        this.ordeerList = ordeerList;
    }

    public Service() {
    }

    public Service(int serviceId, String name, String description, Date dateAdded, boolean status, List<Ordeer> ordeerList) {
        this.serviceId = serviceId;
        this.name = name;
        this.description = description;
        this.dateAdded = dateAdded;
        this.status = status;
        this.ordeerList = ordeerList;
    }
}
