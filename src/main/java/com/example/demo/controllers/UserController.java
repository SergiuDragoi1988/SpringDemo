package com.example.demo.controllers;

import com.example.demo.data.DAO.User;
import com.example.demo.data.DTO.UserDTO;
import com.example.demo.data.repositories.UserRepository;
import com.example.demo.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("user/all")
    public List<UserDTO> getAll() {
        return userService.getAllUsers();

    }
}

