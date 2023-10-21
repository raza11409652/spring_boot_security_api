package com.hackdroid.jwtProject.controller;

import com.hackdroid.jwtProject.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/login")
    private String loginHandler(@RequestBody User u) {
        System.out.println(u.getName());
        return "";
    }
    @PostMapping("/register")
    private String registerHandler(@RequestBody User u) {
        System.out.println(u.getName());
        return "";
    }
}

