package com.example.XampleMongoDB.services;

import com.example.XampleMongoDB.model.Users;
import com.example.XampleMongoDB.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices {
    @Autowired
    private UserRepo userRepo;

    @Override
    public String save(Users users) {
        return userRepo.save(users).getId();
    }
}
