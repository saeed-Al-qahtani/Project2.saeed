package com.example.project2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor @Data
public class MerchantStockClass {

    @NotEmpty (message = "Id can't be empty")
    @Size(min = 3 )
    private String id;


    @NotEmpty(message = "Production can't be empty")
    @Size(min = 3 ,message ="production must be more than 3 ")
    private String productId;


    @NotNull (message = "Merchantid can't be empty")
    @Min(value = 3 ,message ="merchantid must be more than 3 ")
    private int merchantid ;


    @NotEmpty (message = "Stock can't be empty")
    @Min (value = 10,message ="stock must be more than 3 ")
    private int stock ;
}
