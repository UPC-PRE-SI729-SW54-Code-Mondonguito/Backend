package com.example.backend.user.infrastructure.persistence.jpa.repositories;

import com.example.backend.user.domain.model.aggregates.Dueno_de_playas;
import com.example.backend.user.domain.model.aggregates.Usuario;
import com.example.backend.user.domain.model.valueobjects.UsuarioPersonalInfo;

import java.util.Optional;

public interface DuenoRepository extends UsuarioRepository {
    Optional<Dueno_de_playas> findByRUC(String ruc);
}
