package com.example.ProductServiceAug24.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@PrimaryKeyJoinColumn(name = "user_id")
@Entity(name = "jt_Mentor")
public class Mentor extends User {
    private double avg_rating;
    private String CurrentCompany;
}
