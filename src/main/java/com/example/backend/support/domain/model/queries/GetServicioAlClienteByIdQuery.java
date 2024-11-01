package com.example.backend.support.domain.model.queries;

public record GetServicioAlClienteByIdQuery(Long servicioId) {
    public GetServicioAlClienteByIdQuery {
        if (servicioId == null || servicioId <= 0) {
            throw new IllegalArgumentException("servicioId cannot be null or less than or equal to zero");
        }
    }
}
