package com.example.h2;

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
    public List<User> home(){
        Random r = new Random();
        User   u = new User();

        u.setId(Math.abs(r.nextInt()));
        u.setName("BlaTest");
        repo.save(u);


        return repo.findAll();
    }

}
