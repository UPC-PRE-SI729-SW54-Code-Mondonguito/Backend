package com.example.backend.user.application;

import com.example.backend.user.domain.model.aggregates.Usuario;
import com.example.backend.user.domain.model.commands.CreateUsuarioCommand;
import com.example.backend.user.domain.services.DuenoCommandService;
import com.example.backend.user.infrastructure.persistence.jpa.repositories.UsuarioRepository;

import java.util.Optional;

public class DuenoCommandServiceImp extends UsuarioCommandServiceImp implements DuenoCommandService {
    public DuenoCommandServiceImp(UsuarioRepository usuarioRepository) {
        super(usuarioRepository);
    }
}
