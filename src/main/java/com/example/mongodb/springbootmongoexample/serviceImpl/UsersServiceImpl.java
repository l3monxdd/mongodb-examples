package com.example.mongodb.springbootmongoexample.serviceImpl;

import com.example.mongodb.springbootmongoexample.document.Users;
import com.example.mongodb.springbootmongoexample.repository.UserRepository;
import com.example.mongodb.springbootmongoexample.service.UsersService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(Users users) {
        userRepository.save(users);
    }

    @Override
    public void delete(Users users) {
        userRepository.delete(users);
    }

    @Override
    public Users findBy_id(ObjectId objectId) {
        return userRepository.findBy_id(objectId);
    }

    @Override
    public void update(Users users) {
        userRepository.save(users);
    }

    @Override
    public List<Users> findAll() {
        return userRepository.findAll();
    }
}
