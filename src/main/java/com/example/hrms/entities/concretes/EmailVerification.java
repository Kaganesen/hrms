package com.example.hrms.entities.concretes;

import com.example.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "email_verification")

public class EmailVerification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "isVerify")
    private boolean isVerify;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;



}
