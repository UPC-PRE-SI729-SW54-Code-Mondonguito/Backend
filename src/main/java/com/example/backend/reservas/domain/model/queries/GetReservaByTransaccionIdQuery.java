package com.example.backend.reservas.domain.model.queries;

public record GetReservaByTransaccionIdQuery(Long transaccionId) {
    public GetReservaByTransaccionIdQuery {
        if (transaccionId == null || transaccionId <= 0) {
            throw new IllegalArgumentException("transaccionId cannot be null or less than or equal to zero");
        }
    }

}
