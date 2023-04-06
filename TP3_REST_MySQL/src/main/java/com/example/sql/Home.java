package com.example.sql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class Home {


    @Autowired
    UserRepo repo;

    @GetMapping("/")
    public User home(){
        Random r = new Random();
        User   u = new User();

        u.setId(Math.abs(r.nextInt()));
        u.setName("Name");
        repo.save(u);

        return u;
    }


    @GetMapping("/users")
    public List<User> getUsers(){
        return repo.findAll();
    }
}
