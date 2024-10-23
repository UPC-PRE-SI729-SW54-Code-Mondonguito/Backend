package com.example.backend.user.interfaces.rest.resources;

import com.example.backend.user.domain.model.valueobjects.UsuarioRol;

public record UsuarioResource(Long id, String PersonalInfo, UsuarioRol rol) {
}
