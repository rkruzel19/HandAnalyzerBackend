package com.example.backend.service.user;

import com.example.backend.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User saveUser(User user);
    public List<User> getAllUsers();
    public Optional<User> getUserById(int id);
//    public User login(User user);
}
