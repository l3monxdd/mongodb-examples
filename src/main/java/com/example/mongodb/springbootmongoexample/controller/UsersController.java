package com.example.mongodb.springbootmongoexample.controller;

import com.example.mongodb.springbootmongoexample.document.Users;
import com.example.mongodb.springbootmongoexample.repository.UserRepository;
import com.example.mongodb.springbootmongoexample.service.UsersService;
import org.bson.types.ObjectId;
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

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable ObjectId id) {
        usersService.delete(usersService.findBy_id(id));
    }

    @GetMapping("{objectId}")
    public Users findUser(@PathVariable ObjectId objectId) {
        return usersService.findBy_id(objectId);
    }

    @PutMapping()
    public Users updateUser(@RequestBody Users users){
        ObjectId objectId = new ObjectId(users.get_id());
        Users userFromDB = usersService.findBy_id(objectId);
        userFromDB.setFirstName(users.getFirstName());
        userFromDB.setLastName(users.getLastName());
        userFromDB.setAge(users.getAge());
        userFromDB.setPwd(users.getPwd());
        usersService.update(userFromDB);
        return userFromDB;
    }


}
