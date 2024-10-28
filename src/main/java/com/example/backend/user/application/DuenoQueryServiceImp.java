package com.example.backend.user.application;

import com.example.backend.user.domain.model.aggregates.Dueno_de_playas;
import com.example.backend.user.domain.model.aggregates.Usuario;
import com.example.backend.user.domain.model.queries.GetDuenoDePlayasByRUC;
import com.example.backend.user.domain.model.queries.GetUsuarioByDNI;
import com.example.backend.user.domain.services.DuenoQueryService;
import com.example.backend.user.domain.services.UsuarioQueryService;
import com.example.backend.user.infrastructure.persistence.jpa.repositories.DuenoRepository;
import com.example.backend.user.infrastructure.persistence.jpa.repositories.UsuarioRepository;

import java.util.Optional;

public class DuenoQueryServiceImp extends UsuarioQueryServiceImp implements DuenoQueryService {
    public DuenoQueryServiceImp(UsuarioRepository usuarioRepository, DuenoRepository duenoRepository) {
        super(usuarioRepository);
        this.duenoRepository = duenoRepository;
    }

    private final DuenoRepository duenoRepository;

    @Override
    public Optional<Dueno_de_playas> handle(GetDuenoDePlayasByRUC query){
        return this.duenoRepository.findByRUC(query.RUC());
    }
}
