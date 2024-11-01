package com.example.backend.reservas.domain.services;

import com.example.backend.reservas.domain.model.aggregates.Espacio;
import com.example.backend.reservas.domain.model.queries.GetEspacioByIdQuery;
import com.example.backend.reservas.domain.model.queries.GetEspacioByReservaIdQuery;

import java.util.Optional;

public interface EspacioQueryService {
    Optional<Espacio> handle(GetEspacioByIdQuery query);
    Optional<Espacio> handle(GetEspacioByReservaIdQuery query);
}
