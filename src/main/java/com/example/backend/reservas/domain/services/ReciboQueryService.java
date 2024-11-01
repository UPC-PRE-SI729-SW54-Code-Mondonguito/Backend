package com.example.backend.reservas.domain.services;

import com.example.backend.reservas.domain.model.aggregates.Recibo;
import com.example.backend.reservas.domain.model.queries.GetReciboByIdQuery;

import java.util.Optional;

public interface ReciboQueryService {
    Optional<Recibo> handle(GetReciboByIdQuery query);
}
