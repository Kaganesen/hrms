package com.example.hrms.entities.abstracts;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
//@JsonIgnoreProperties({"HibernateLazyInitializer","Handler"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column (name = "email")
    private String email;

    @Column (name = "password")
    private String password;

    @Column (name = "repeat_password")
    private String repeatPassword;
}

