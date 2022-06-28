package com.example.glassbaren.model;

import javax.persistence.*;
import java.io.Serializable;

//Transforms this class to a different type of String with Serializable


//This class is gonna be in a database so we can update the information using Entity
@Entity
public class Customer implements Serializable {
    // Varibales of an customer
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false) //Once the id is set, it can never be changed or updated in the database
    private Long id; //Primary Key
    private String name;
    private String email;
    private String phonenumber;
    private String jobTitle;
    @Column(nullable = false, updatable = false) //Once the employeeCode is set, it can never be changed or updated in the database
    private String customerCode;
    private String imageUrl; // Holds the location where we have the image

    public Customer() {}

    public Customer(Long id, String name, String email, String phonenumber, String jobTitle, String customerCode, String imageUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.jobTitle = jobTitle;
        this.customerCode = customerCode;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
