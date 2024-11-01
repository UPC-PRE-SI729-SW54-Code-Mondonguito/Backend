package com.example.backend.reservas.domain.model.queries;

public record GetEspacioByReservaIdQuery(Long reservaId) {

    public GetEspacioByReservaIdQuery {
        if (reservaId == null || reservaId <= 0) {
            throw new IllegalArgumentException("reservaId cannot be null or less than or equal to zero");
        }
    }
}
