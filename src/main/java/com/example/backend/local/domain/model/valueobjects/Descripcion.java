package com.example.backend.local.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record Descripcion(String descripcion) {

    public Descripcion {
        if (descripcion == null || descripcion.isBlank()) {
            throw new IllegalArgumentException("Descripcion no puede ser nulo ni blanco");
        }

    }

}
