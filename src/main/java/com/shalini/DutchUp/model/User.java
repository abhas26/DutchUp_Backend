package com.shalini.DutchUp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User_Info") // MongoDB collection name
public class User {
    @Id
    private String _id;
    private String Name;

    // Constructors
    public User() {}
    public User(String name) {
        this.Name = name;
    }

    // Getters and Setters
    public String getId() { return _id; }
    public void setId(String id) { this._id = _id; }

    public String getName() { return Name; }
    public void setName(String name) { this.Name = name; }
}
