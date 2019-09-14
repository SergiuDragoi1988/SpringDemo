package com.example.demo.data.DAO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identitatea obiectului!UPDATE de fiecare data!genereaza ID pt baza de date
    @EqualsAndHashCode.Include
    private int id;
    private String name;
    private String email;
    private LocalDate birthDate;


    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;


    @OneToMany(mappedBy = "owner")
    private List<Book> books;



    @Transient
    private long age;

    public User() {

    }

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;

    }






}
