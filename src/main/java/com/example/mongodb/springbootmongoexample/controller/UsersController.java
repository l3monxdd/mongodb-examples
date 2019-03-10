package com.example.mongodb.springbootmongoexample.controller;

import com.example.mongodb.springbootmongoexample.document.Users;
import com.example.mongodb.springbootmongoexample.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @GetMapping("/all")
    public List<Users> getAll() {
        return usersService.findAll();
    }

    @PostMapping
    public Users addUser(@RequestBody Users users) {
        usersService.save(users);
        return users;
    }


}
