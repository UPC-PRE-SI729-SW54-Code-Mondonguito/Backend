package com.example.backend.reservas.domain.model.aggregates;

import jakarta.persistence.Entity;
import lombok.Getter;

import java.security.PrivateKey;

@Getter
@Entity
public class Reservas {
    private String name;
    private String description;


}
