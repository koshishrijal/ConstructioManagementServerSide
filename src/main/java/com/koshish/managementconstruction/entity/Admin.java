package com.koshish.managementconstruction.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tbl_admin")
public class Admin implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="admin_id")
    private int adminId;
    @Column(name="admin_name")
    private String adminName;
    @Column(name="role")
    private String role;
    @Column(name="password")
    private String password;
    @Column(name="email")
    private String email;

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Admin() {
    }

    public Admin(String adminName, String role, String password, String email) {
        this.adminName = adminName;
        this.role = role;
        this.password = password;
        this.email = email;
    }
}
