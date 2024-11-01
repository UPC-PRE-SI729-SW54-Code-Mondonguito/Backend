package com.example.backend.reservas.domain.services;

import com.example.backend.reservas.domain.model.aggregates.Transaccion;
import com.example.backend.reservas.domain.model.queries.GetTransaccionByIdQuery;
import com.example.backend.reservas.domain.model.queries.GetTransaccionByReciboIdQuery;

import java.util.Optional;

public interface TransaccionQueryService {
    Optional<Transaccion> handle(GetTransaccionByIdQuery query);
    Optional<Transaccion> handle(GetTransaccionByReciboIdQuery query);
}
