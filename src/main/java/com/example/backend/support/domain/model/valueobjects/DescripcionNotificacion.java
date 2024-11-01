package com.example.backend.support.domain.model.valueobjects;

public record DescripcionNotificacion(String descripcion) {
    public DescripcionNotificacion {
        if (descripcion == null || descripcion.isBlank()) {
            throw new IllegalArgumentException("descripcion can't be null or empty");
        }
    }
}
