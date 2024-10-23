package com.example.backend.user.application;

import com.example.backend.user.domain.model.aggregates.Usuario;
import com.example.backend.user.domain.model.queries.GetUsuarioByDNI;
import com.example.backend.user.domain.model.queries.GetUsuarioByIdQuery;
import com.example.backend.user.domain.services.UsuarioQueryService;
import com.example.backend.user.infrastructure.persistence.jpa.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioQueryServiceImp implements UsuarioQueryService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioQueryServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> handle(GetUsuarioByDNI query){
        return this.usuarioRepository.findByDni(query.usuarioPersonalInfo());
    }

    @Override
    public Optional<Usuario> handle(GetUsuarioByIdQuery query) {
        return this.usuarioRepository.findById(query.id());
    }

}
