package com.example.inmemoryauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String helloPrivate() {
        return "Hello! from private area";
    }

    @GetMapping("/user")
    public String helloUserPrivate() {
        return "Hello! from user private area";
    }

    @GetMapping("/admin")
    public String helloAdminPrivate() {
        return "Hello! from user private area";
    }


}
