package com.example.backend.support.domain.model.queries;

public record GetAsesoriaByIdQuery(Long asesoriaId) {
    public GetAsesoriaByIdQuery {
        if (asesoriaId == null || asesoriaId <= 0) {
            throw new IllegalArgumentException("asesoriaId cannot be null or less than or equal to zero");
        }
    }
}
