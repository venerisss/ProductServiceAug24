package com.example.ProductServiceAug24.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_mentor")
public class Mentor extends User{
    private double avg_rating;
    private String CurrentCompany;
}
