package com.example.demo.services;

import com.example.demo.data.DTO.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> getAllUsers();

}
