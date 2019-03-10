package com.example.mongodb.springbootmongoexample.repository;

import com.example.mongodb.springbootmongoexample.document.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
    Users findBy_id(ObjectId _id);
}
