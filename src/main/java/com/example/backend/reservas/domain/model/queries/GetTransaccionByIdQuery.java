package com.example.backend.reservas.domain.model.queries;

public record GetTransaccionByIdQuery(Long transaccionId) {
    public GetTransaccionByIdQuery {
        if (transaccionId == null || transaccionId <= 0) {
            throw new IllegalArgumentException("transaccionId cannot be null or less than or equal to zero");
        }
    }
}
