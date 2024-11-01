package com.example.backend.reservas.domain.model.queries;

public record GetTransaccionByReciboIdQuery(Long reciboId) {
    public GetTransaccionByReciboIdQuery {
        if (reciboId == null || reciboId <= 0) {
            throw new IllegalArgumentException("reciboId cannot be null or less than or equal to zero");
        }
    }
}
