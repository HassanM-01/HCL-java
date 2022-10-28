package com.hassan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private int id;
    private String name;
    private String email;
    private String country;

    public Employee(String name, String email, String country){
        this.name = name;
        this.email = email;
        this.country = country;
    }



}
