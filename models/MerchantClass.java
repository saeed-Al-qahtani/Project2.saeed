package com.example.project2.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Data
public class MerchantClass {

    @NotEmpty (message = "Id can't be empty")
    @Size (message ="id must be more than 3 ")
    private String id;


    @NotEmpty (message = "name can't be empty")
    @Size (min = 3 ,message ="name must be more than 3 ")
    private String name;

}