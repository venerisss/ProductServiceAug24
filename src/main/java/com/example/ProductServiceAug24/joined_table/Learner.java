package com.example.ProductServiceAug24.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "jt_learner")
@PrimaryKeyJoinColumn(name = "user_id") //here we decide on what column the join is going to take place this is done so that we establish a join relation with a foreign key and a primary key, here we want to join use and inside user, it is id, thus we name it user_id
public class Learner extends User {
    private String college;
    private String company;
}
