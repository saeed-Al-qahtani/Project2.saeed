package com.example.project2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

@AllArgsConstructor @Data
public class UserClass {

    @NotEmpty (message = "Id can't be empty")
    @Size(min = 3 ,message ="id must be more than 3 ")
    private String id;


    @NotEmpty (message = "Id can't be empty")
    @Size(min = 5 ,message ="name must be more than 3 ")
    private String name;

    @NotEmpty (message = "Id can't be empty")
    @Size(min=6 ,message =",message = id must be more than 3 ")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$",message = "please enter strong password")
    private String password;


    @NotEmpty(message = "email can't be empty")
    @Email (message = "email must be @")
    private String email;


    @NotEmpty(message = "role can't be empty")
    @Pattern(regexp = "(admin|customer)",message = "Role must be in admin or user only")
    private String role;


    @NotNull(message = "role can't be null")
    @Positive( message = "balance have to be positive")
    private int balance;

}
