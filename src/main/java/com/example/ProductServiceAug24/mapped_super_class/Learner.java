package com.example.ProductServiceAug24.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_learners")//this will create the name for the tables that are created in sql
public class Learner extends User{
    private String college;
    private String company;

}
