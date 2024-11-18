package com.example.backend.local.domain.model.valueobjects;

public record OpinionDescripcion(String opinionDescripcion) {
    public OpinionDescripcion {
        if (opinionDescripcion == null || opinionDescripcion.isEmpty()) {
            throw new IllegalArgumentException("Opinion descripcion no puede estar vacio");

        }
    }
}
