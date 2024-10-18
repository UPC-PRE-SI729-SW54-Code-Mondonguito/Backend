package com.example.backend.user.domain.services;

import com.example.backend.user.domain.model.aggregates.Usuario;
import com.example.backend.user.domain.model.commands.CreateUsusarioCommand;

import java.util.Optional;

public interface UsuarioCommandService {
    Optional<Usuario> handle(CreateUsusarioCommand command);
}
