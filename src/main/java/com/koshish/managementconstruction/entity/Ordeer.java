package com.koshish.managementconstruction.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="tbl_order")
public class Ordeer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="order_id")
    private int orderId;
    @Column(name="client_name")
    private String clientName;
    @Column(name="address")
    private String address;
    @Column(name="site_location")
    private String siteLocation;
    @Column(name="project_detail")
    private String projectDetail;
    @Column(name="time_for_completion_in_month")
    private int timeForCompletionInMonth;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name="date_to_start")
    private Date dateToStart;
    @Temporal(value=TemporalType.TIMESTAMP)
    @Column(name="date_added",insertable = false)
    private Date dateAdded;
    @Column(name="client_phone_number")
    private String clientPhoneNumber;
    @Column(name="client_email")
    private String clientEmail;
    
    @ManyToOne
    @JoinColumn(name="tbl_service_service_id",referencedColumnName = "service_id")
    private Service service;
    //list should be back reeference to avoid stackoverflow
    @OneToMany(mappedBy="order",cascade = CascadeType.ALL)
     @JsonBackReference
    private List<Project> projectList;
    
    public int getOrderId() {
        return orderId;
    }

    public List<Project> getProjectList() {
       return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public Ordeer() {
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSiteLocation() {
        return siteLocation;
    }

    public void setSiteLocation(String siteLocation) {
        this.siteLocation = siteLocation;
    }

    public String getProjectDetail() {
        return projectDetail;
    }

    public void setProjectDetail(String projectDetail) {
        this.projectDetail = projectDetail;
    }

    public int getTimeForCompletionInMonth() {
        return timeForCompletionInMonth;
    }

    public void setTimeForCompletionInMonth(int timeForCompletionInMonth) {
        this.timeForCompletionInMonth = timeForCompletionInMonth;
    }

    public Date getDateToStart() {
        return dateToStart;
    }

    public void setDateToStart(Date dateToStart) {
        this.dateToStart = dateToStart;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Ordeer(int orderId, String clientName, String address, String siteLocation, String projectDetail, int timeForCompletionInMonth, Date dateToStart, Date dateAdded, String clientPhoneNumber, String clientEmail, Service service, List<Project> projectList) {
        this.orderId = orderId;
        this.clientName = clientName;
        this.address = address;
        this.siteLocation = siteLocation;
        this.projectDetail = projectDetail;
        this.timeForCompletionInMonth = timeForCompletionInMonth;
        this.dateToStart = dateToStart;
        this.dateAdded = dateAdded;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientEmail = clientEmail;
        this.service = service;
        this.projectList = projectList;
    }


}
