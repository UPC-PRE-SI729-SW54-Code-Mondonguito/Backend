package com.example.backend.user.application;

import com.example.backend.user.domain.model.aggregates.Conductor;
import com.example.backend.user.domain.model.aggregates.Usuario;
import com.example.backend.user.domain.model.queries.GetConductorByPlaca;
import com.example.backend.user.domain.model.queries.GetUsuarioByDNI;
import com.example.backend.user.domain.model.queries.GetUsuarioByIdQuery;
import com.example.backend.user.domain.services.ConductorCommandQuery;
import com.example.backend.user.domain.services.ConductorQueryService;
import com.example.backend.user.domain.services.DuenoCommandService;
import com.example.backend.user.infrastructure.persistence.jpa.repositories.UsuarioRepository;

import java.util.Optional;

public class ConductorCommandServiceImp extends UsuarioCommandServiceImp implements ConductorCommandQuery {
    public ConductorCommandServiceImp(UsuarioRepository usuarioRepository) {
        super(usuarioRepository);
    }
}
