package com.example.prod.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name ="name")
    private String name;

    @Column(name = "time")
    private int time;

    @Column(name = "user_id")
    private int user_id;
}
