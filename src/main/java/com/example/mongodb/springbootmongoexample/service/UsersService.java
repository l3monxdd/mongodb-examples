package com.example.mongodb.springbootmongoexample.service;

import com.example.mongodb.springbootmongoexample.document.Users;

import java.util.List;

public interface UsersService {

    void save(Users users);

    void delete(int id);

    void update(Users users);

    Users findOne(int id);

    List<Users> findAll();



}
