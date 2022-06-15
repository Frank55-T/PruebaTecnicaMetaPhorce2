package com.metaphorce.demo.Models;

import javax.persistence.*;
import javax.validation.Constraint;
import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "employeeid")
    private int employeeId;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "birthdate")
    private Date birthday;
    @Column(name = "email")
    private String email;
    @Column(name = "cellphone")
    private String cellphone;
    @Column(name = "contracttypee")
    private int contractTypee;
    @Column(name = "isactive")
    private boolean isActive;

    public int getEmployeeid() {
        return employeeId;
    }

    public void setEmployeeid(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public int getContractTypee() {
        return contractTypee;
    }

    public void setContractTypee(int contractTypee) {
        this.contractTypee = contractTypee;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
