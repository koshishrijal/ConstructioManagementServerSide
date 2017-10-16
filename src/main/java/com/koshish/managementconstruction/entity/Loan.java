package com.koshish.managementconstruction.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_loan")
public class Loan {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="loan_id")
    private int loanId;
    @Column(name="type")
    private String type;
    @Column(name="name")
    private String name;
    @Column(name="value")
    private Double value;
    @Column(name="date_taken")
    private Date dateTaken;
    @Column(name="date_to_be_paid")
    private Date dateToBePaid;
    @Column(name="installment_time_monthly")
    private int installmentTimeMonthly;
    @Column(name="installment_amount")
    private Double installmentAmount;

    public Loan() {
    }

    public Loan(String type, String name, Double value, Date dateTaken, Date dateToBePaid, int installmentTimeMonthly, Double installmentAmount) {
        this.type = type;
        this.name = name;
        this.value = value;
        this.dateTaken = dateTaken;
        this.dateToBePaid = dateToBePaid;
        this.installmentTimeMonthly = installmentTimeMonthly;
        this.installmentAmount = installmentAmount;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    public Date getDateToBePaid() {
        return dateToBePaid;
    }

    public void setDateToBePaid(Date dateToBePaid) {
        this.dateToBePaid = dateToBePaid;
    }

    public int getInstallmentTimeMonthly() {
        return installmentTimeMonthly;
    }

    public void setInstallmentTimeMonthly(int installmentTimeMonthly) {
        this.installmentTimeMonthly = installmentTimeMonthly;
    }

    public Double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(Double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }
}
