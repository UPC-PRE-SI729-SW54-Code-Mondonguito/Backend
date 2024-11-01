package com.example.backend.reservas.domain.model.queries;

public record GetReservaByIdQuery(Long reservaId) {
    public GetReservaByIdQuery {
        if (reservaId == null || reservaId <= 0) {
            throw new IllegalArgumentException("reservaId cannot be null or less than or equal to zero");
        }
    }
}
