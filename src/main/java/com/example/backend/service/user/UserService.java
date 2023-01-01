package com.example.backend.service.user;

import com.example.backend.model.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user);
    public List<User> getAllUsers();

}
