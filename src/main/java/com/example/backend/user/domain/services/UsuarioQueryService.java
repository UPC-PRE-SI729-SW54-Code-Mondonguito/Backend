package com.example.backend.user.domain.services;

import com.example.backend.user.domain.model.aggregates.Usuario;
import com.example.backend.user.domain.model.queries.GetUsuarioByDNI;
import com.example.backend.user.domain.model.queries.GetUsuarioByIdQuery;

import java.util.Optional;

public interface UsuarioQueryService {

    Optional<Usuario> handle(GetUsuarioByDNI query);

    Optional<Usuario> handle(GetUsuarioByIdQuery query);

}
