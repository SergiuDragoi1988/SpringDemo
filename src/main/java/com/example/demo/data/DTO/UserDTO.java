package com.example.demo.data.DTO;

import com.example.demo.data.DAO.User;
import lombok.Getter;



@Getter
public class UserDTO {
    private  String name;
    private String email;



    public UserDTO(User u) {
        this.email = u.getEmail();
        this.name = u.getName();

    }
}
