package com.example.mongodb.springbootmongoexample.service;

import com.example.mongodb.springbootmongoexample.document.Users;
import org.bson.types.ObjectId;

import java.util.List;

public interface UsersService {

    void save(Users users);

    void delete(Users users);

    void update(Users users);

//    Users findBy_id(ObjectId _id);

    List<Users> findAll();





}
