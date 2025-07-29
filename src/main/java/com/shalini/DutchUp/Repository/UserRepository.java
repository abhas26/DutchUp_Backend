package com.shalini.DutchUp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shalini.DutchUp.model.User;

public interface UserRepository extends MongoRepository<User, String> {
}