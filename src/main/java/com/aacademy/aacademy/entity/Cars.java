package com.aacademy.aacademy.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "model", nullable = false, length = 50, unique = true)
    private String model;

    @NotNull
    @Column(name = "color", nullable = false, length = 50)
    private String color;

    @NotNull
    @Column(name = "horsepower", nullable = false, length = 50)
    private Integer horsepower;



    public void setModel(String name) {
        this.model = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsepower = horsePower;
    }
}
