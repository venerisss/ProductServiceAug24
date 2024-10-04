package com.example.ProductServiceAug24.table_per_class;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Setter
//@Getter //this getter and setter can be gained by using lombok
//@Data this is the granddaddy of getters and setters and it encompasses both getters and setters
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity(name = "tpc_users")
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;
}
