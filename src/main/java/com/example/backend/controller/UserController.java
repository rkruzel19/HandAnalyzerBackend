package com.example.backend.controller;

import com.example.backend.model.User;
import com.example.backend.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        userService.saveUser(user);
        return "New user is added";
    }

    @GetMapping("/getUserById/{id}")
    public Optional<User> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}
