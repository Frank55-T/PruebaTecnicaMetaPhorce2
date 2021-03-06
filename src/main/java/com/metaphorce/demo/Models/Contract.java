package com.metaphorce.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contract")
public class  Contract {
    @Id
    @Column(name ="contracttype")
    private int contractType;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public int getContractType() {
        return contractType;
    }

    public void setContractType(int contractType) {
        this.contractType = contractType;
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
}
