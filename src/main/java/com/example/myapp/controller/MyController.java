package com.example.myapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {


    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
    @GetMapping("/hello2")
    public String helloWorld2() {
        return "Hello, World22222222!";
    }

}
