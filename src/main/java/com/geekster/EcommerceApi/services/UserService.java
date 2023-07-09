package com.geekster.EcommerceApi.services;

import com.geekster.EcommerceApi.models.User;
import com.geekster.EcommerceApi.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
   private IUserRepo iUserRepo;

    public String createUser(User userObj) {
        iUserRepo.save(userObj);
        return "user created";
    }

    public Optional<User> getUserById(Integer id) {
        return iUserRepo.findById(id);
    }
}
