package com.example.backend.user.domain.model.valueobjects;

import com.example.backend.user.domain.model.aggregates.Usuario;
import jakarta.persistence.Embeddable;

@Embeddable
public record UsuarioRol(String rol) {
    public UsuarioRol() {this(null);}
    public UsuarioRol{
        if(rol == null || rol.isBlank()){
            throw new IllegalArgumentException("Rol is required");
        }
    }

}
