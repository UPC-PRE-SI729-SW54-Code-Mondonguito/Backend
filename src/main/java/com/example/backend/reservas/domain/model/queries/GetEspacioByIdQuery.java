package com.example.backend.reservas.domain.model.queries;

public record GetEspacioByIdQuery(Long espacioId) {
    public GetEspacioByIdQuery {
        if (espacioId == null || espacioId <= 0) {
            throw new IllegalArgumentException("espacioId cannot be null or less than or equal to zero");
        }
    }

}
