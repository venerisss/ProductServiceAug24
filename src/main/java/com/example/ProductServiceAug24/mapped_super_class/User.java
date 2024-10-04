package com.example.ProductServiceAug24.mapped_super_class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter //this getter and setter can be gained by using lombok
//@Data this is the granddaddy of getters and setters and it encompasses both getters and setters
@MappedSuperclass //this will communicate that we want to use mapped super class and the class on which this is written becomes the parent class
//do not write @Entity in the parent class, instead write it in the child class
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;
}
