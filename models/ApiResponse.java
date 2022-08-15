package com.example.project2.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class ApiResponse {
    private String message;
    private int state;


}
