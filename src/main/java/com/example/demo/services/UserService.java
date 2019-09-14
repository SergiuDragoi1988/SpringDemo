package com.example.demo.services;

import com.example.demo.data.DAO.User;
import com.example.demo.data.DTO.UserDTO;
import com.example.demo.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("iUserService")
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> users = new ArrayList<UserDTO>();
        Iterable<User> all = userRepository.findAll();
        all.forEach(u -> users.add(new UserDTO(u)));

        return users;

    }
    }

