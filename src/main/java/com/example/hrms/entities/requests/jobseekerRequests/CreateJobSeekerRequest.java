package com.example.hrms.entities.requests.jobseekerRequests;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateJobSeekerRequest {

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String identityNumber;
    @NotNull
    @JsonFormat(pattern="dd/MM/yyyy")
    private LocalDate birthDay;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String repeatPassword;


}
