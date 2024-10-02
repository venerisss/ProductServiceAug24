package com.example.ProductServiceAug24.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
/*@Getter //Using this annotations, all the attributes will have getters(using LOMBOK)
@Setter*/
@Entity //this will help springboot understand that we need to add the following as tables to the db
public class Product {
    @Id //this is used to tell spring boot that this is the attribute that should be taken as the primary key
    private long id;
    String name;
    String category;
    String description; //use cmd n to select getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
