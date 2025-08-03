package com.shalini.DutchUp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User_Info") // MongoDB collection name
public class User {
    @Id
    private String _id;
    private String name;
    private String emailID;
    private String contactNo; 

    // Constructors
    public User() {}
    public User(String name) {
        this.name = name;
    }
    public String get_id() {
        return _id;
    }
    public String getEmailID() {
        return emailID;
    }
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getContactNo() {
        return contactNo;
    }
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
