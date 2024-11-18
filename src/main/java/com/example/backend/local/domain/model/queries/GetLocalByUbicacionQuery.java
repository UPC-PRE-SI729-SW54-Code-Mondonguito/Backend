package com.example.backend.local.domain.model.queries;

public record GetLocalByUbicacionQuery(String ubicacion) {
    public GetLocalByUbicacionQuery {
        if (ubicacion == null || ubicacion.isBlank()) {
            throw new IllegalArgumentException("ubicacion is null or empty");
        }
    }
}
