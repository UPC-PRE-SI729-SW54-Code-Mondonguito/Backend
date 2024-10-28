package com.example.backend.user.domain.services;

import com.example.backend.user.domain.model.aggregates.Conductor;
import com.example.backend.user.domain.model.queries.GetConductorByPlaca;
import com.example.backend.user.domain.model.valueobjects.ConductorPlaca;

import java.util.Optional;

public interface ConductorQueryService extends UsuarioQueryService{

    Optional<Conductor> handle(GetConductorByPlaca query);
}
