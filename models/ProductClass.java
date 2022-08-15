package com.example.project2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

@AllArgsConstructor @Data
public class ProductClass {
    @NotEmpty (message = "Id can't be empty")
    @Size(min = 3 ,message ="id must be more than 3 ")
    private String id;


    @NotEmpty (message = "name can't be empty")
    @Size(min = 3 ,message ="name must be more than 3 ")
    private String name;


    @NotNull (message = "price can't be null")
    @Positive(message ="price must be positive number ")
    private int price;


    @NotEmpty
    @Size(min = 3 )
    private String categoryID;
}