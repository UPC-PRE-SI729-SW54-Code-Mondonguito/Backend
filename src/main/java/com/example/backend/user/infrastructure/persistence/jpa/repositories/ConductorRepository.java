package com.example.backend.user.infrastructure.persistence.jpa.repositories;

import com.example.backend.user.domain.model.aggregates.Conductor;

import java.util.Optional;

public interface ConductorRepository extends UsuarioRepository{
    Optional<Conductor> findByPlaca(String placa);
}
