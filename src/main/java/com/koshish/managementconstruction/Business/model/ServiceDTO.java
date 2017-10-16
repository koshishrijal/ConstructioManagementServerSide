package com.koshish.managementconstruction.Business.model;

import java.io.Serializable;
import java.util.Date;

public class ServiceDTO implements Serializable{
    private int serviceId;
    private String name;
    private String description;
    private Date dateAdded;
    private boolean status;

    public ServiceDTO() {
    }

    public int getServiceId() {
        return serviceId;
    }

    public ServiceDTO(int serviceId, String name, String description, Date dateAdded, boolean status) {
        this.serviceId = serviceId;
        this.name = name;
        this.description = description;
        this.dateAdded = dateAdded;
        this.status = status;
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
}
