package com.example.backend.local.domain.model.valueobjects;

public record Ubicacion(String ubicacion) {
    public Ubicacion {
        if (ubicacion == null || ubicacion.isBlank()) {
            throw new  IllegalArgumentException("Ubicacion can't be null ");
        }
    }
}
