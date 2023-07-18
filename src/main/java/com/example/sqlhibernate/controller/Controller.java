package com.example.sqlhibernate.controller;

import com.example.sqlhibernate.dao.entity.User;
import com.example.sqlhibernate.dao.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final UserRepository userRepository;

    public Controller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping ("/persons/by-city")
    public List<User> getPersonsByCity(@RequestParam("city") String city) {
        return userRepository.getPersonsByCity(city);
    }
}