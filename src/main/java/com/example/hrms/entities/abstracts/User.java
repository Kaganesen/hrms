package com.example.hrms.entities.abstracts;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
//@JsonIgnoreProperties({"HibernateLazyInitializer","Handler",})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    
    @Email
    @NotBlank
    @NotNull
    @Column (name = "email")
    private String email;
    
    @NotBlank
    @NotNull
    @Column (name = "password")
    private String password;

    @NotBlank
    @NotNull
    @Column (name = "repeat_password")
    private String repeatPassword;
}

