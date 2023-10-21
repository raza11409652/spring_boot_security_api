package com.hackdroid.jwtProject.service;

import com.hackdroid.jwtProject.models.User;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Service
public class UserService {
    List<User> users = new ArrayList<>();
    UserService(){

        users.add(new User("1","name 1","email_1@example.com"));
        users.add(new User("2","name 2","email_2@example.com"));
        users.add(new User("3","name 3","email_3@example.com"));

    }
}
