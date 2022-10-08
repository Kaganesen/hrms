package com.example.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="job_seekers")

public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    @NotNull
    private int id;

    @NotNull
    @Column (name = "first_name")
    private String firstName;

    @NotNull
    @Column (name = "last_name")
    private String lastName;

    @NotNull
    @Column (name = "identity_number")
    private String identityNumber;

    @NotNull
    @Column (name = "birth_date")
    private LocalDate birthDate;

    @NotNull
    @Column (name = "email")
    private String email;

    @NotNull
    @Column (name = "password")
    private String password;

    @NotNull
    @Column (name = "again_password")
    private String againPassword;


}
