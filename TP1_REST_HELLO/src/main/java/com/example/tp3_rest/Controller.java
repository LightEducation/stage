package com.example.tp3_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @GetMapping("/")
    public Hello hello(){
        return new Hello(1,"Welcome To REST API, PORT:8010");
    }

}
