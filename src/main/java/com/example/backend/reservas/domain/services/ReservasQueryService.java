package com.example.backend.reservas.domain.services;

import com.example.backend.reservas.domain.model.aggregates.Reservas;
import com.example.backend.reservas.domain.model.queries.GetReservaByIdQuery;
import com.example.backend.reservas.domain.model.queries.GetReservaByTransaccionIdQuery;

import java.util.Optional;

public interface ReservasQueryService {
    Optional<Reservas> handle(GetReservaByIdQuery query);
    Optional<Reservas> handle(GetReservaByTransaccionIdQuery query);
}
