package com.example.ProductServiceAug24.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter //this getter and setter can be gained by using lombok
//@Data this is the granddaddy of getters and setters and it encompasses both getters and setters
@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "jt_users")
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;
}