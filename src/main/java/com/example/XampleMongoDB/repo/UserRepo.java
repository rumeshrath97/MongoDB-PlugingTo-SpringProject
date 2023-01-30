package com.example.XampleMongoDB.repo;

import com.example.XampleMongoDB.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends MongoRepository <Users,String>{




}
