package com.example.ProductServiceAug24.Models;

import lombok.Getter;
import lombok.Setter;
/*@Getter //Using this annotations, all the attributes will have getters(using LOMBOK)
@Setter*/
public class Product {
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
}
