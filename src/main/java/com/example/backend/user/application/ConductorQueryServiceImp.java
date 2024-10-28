package com.example.backend.user.application;

import com.example.backend.user.domain.model.aggregates.Conductor;
import com.example.backend.user.domain.model.queries.GetConductorByPlaca;
import com.example.backend.user.domain.services.ConductorQueryService;
import com.example.backend.user.domain.services.DuenoQueryService;
import com.example.backend.user.infrastructure.persistence.jpa.repositories.ConductorRepository;
import com.example.backend.user.infrastructure.persistence.jpa.repositories.UsuarioRepository;

import java.util.Optional;

public class ConductorQueryServiceImp extends UsuarioQueryServiceImp implements ConductorQueryService {

    public ConductorQueryServiceImp(UsuarioRepository usuarioRepository, ConductorRepository conductorRepository) {
        super(usuarioRepository);
        this.conductorRepository = conductorRepository;
    }
    private final ConductorRepository conductorRepository;

    @Override
    public Optional<Conductor> handle(GetConductorByPlaca query){
        return this.conductorRepository.findByPlaca(query.placa());
    }
}
