package com.example.ProductServiceAug24.single_table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter //this getter and setter can be gained by using lombok
//@Data this is the granddaddy of getters and setters and it encompasses both getters and setters
public class User {

    private int id;
    private String name;
    private String email;
    private String password;
}
