package com.example.tp4_security_auth_basic;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String home(){
        return "<h1>Bonjour!</h1>";
    }
}
