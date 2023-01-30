package com.example.XampleMongoDB.controller;

import com.example.XampleMongoDB.model.Users;
import com.example.XampleMongoDB.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/save")
    public String saveUser(@RequestBody Users users){
        return userServices.save(users);
    }

}
