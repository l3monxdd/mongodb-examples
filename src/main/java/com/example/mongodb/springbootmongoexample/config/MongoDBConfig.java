package com.example.mongodb.springbootmongoexample.config;

import com.example.mongodb.springbootmongoexample.document.Users;
import com.example.mongodb.springbootmongoexample.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(UserRepository userRepository){
//        return args -> {
//            Users users = new Users();
//            users.setFirstName("John");
//            users.setLastName("Doe");
//            users.setPwd("1234");
//            users.setAge(30);
////            userRepository.save(users);
//        };
//    }
}
