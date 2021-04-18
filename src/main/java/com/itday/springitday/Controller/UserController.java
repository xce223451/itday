package com.itday.springitday.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itday.springitday.Bean.User;
import com.itday.springitday.service.UserService;



@RestController
@RequestMapping("/users")

public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> listUser(){
        return userService.findAll();
    }

    @PostMapping("/userpost")
    public User create(@RequestBody User user){
        return userService.save(user);
    }
}
