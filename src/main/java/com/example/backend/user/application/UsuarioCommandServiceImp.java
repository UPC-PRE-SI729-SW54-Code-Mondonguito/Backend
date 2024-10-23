package com.example.backend.user.application;


import com.example.backend.user.domain.model.aggregates.Usuario;
import com.example.backend.user.domain.model.commands.CreateUsusarioCommand;
import com.example.backend.user.domain.model.valueobjects.UsuarioPersonalInfo;
import com.example.backend.user.domain.services.UsuarioCommandService;
import com.example.backend.user.infrastructure.persistence.jpa.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioCommandServiceImp implements UsuarioCommandService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioCommandServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> handle(CreateUsusarioCommand command){
        var dni = new UsuarioPersonalInfo(command.dni());
        usuarioRepository.findByDni(dni).map(usuario -> {
            throw new IllegalArgumentException("Profile with DNI "+dni+" already exists");
        });
        var usuario = new Usuario(command);
        var createdUsuario = usuarioRepository.save(usuario);
        return Optional.of(createdUsuario);

    }

}
