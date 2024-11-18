package com.example.backend.local.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record Nombre(String nombre) {

    public Nombre {
        if (nombre == null || nombre.isBlank()){

            throw new IllegalArgumentException("Nombre can't be null or empty");

        }

    }

}
