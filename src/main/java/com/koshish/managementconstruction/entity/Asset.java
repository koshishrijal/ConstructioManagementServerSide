package com.koshish.managementconstruction.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name="tbl_asset")
@Entity
public class Asset implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="asset_id")
    private int assetId;
    @Column(name="name")
    private String name;
    @Column(name="type")
    private String type;
    @Column(name="monetory_value")
    private double monetoryValue;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name="date_added")
    private Date dateAdded;

    public Asset() {
    }

    public Asset(int  assetId,String name, String type, double monetoryValue, Date dateAdded) {
        this.assetId=assetId;
        this.name = name;
        this.type = type;
        this.monetoryValue = monetoryValue;
        this.dateAdded = dateAdded;
    }

    public long getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMonetoryValue() {
        return monetoryValue;
    }

    public void setMonetoryValue(double monetoryValue) {
        this.monetoryValue = monetoryValue;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
