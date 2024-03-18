package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer getIdrol;
    private String description;

    public Rol() {
    }

    public Integer getGetIdrol() {
        return getIdrol;
    }

    public void setGetIdrol(Integer getIdrol) {
        this.getIdrol = getIdrol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}