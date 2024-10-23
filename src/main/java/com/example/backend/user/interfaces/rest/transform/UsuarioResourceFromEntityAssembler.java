package com.example.backend.user.interfaces.rest.transform;

import com.example.backend.user.domain.model.aggregates.Usuario;
import com.example.backend.user.interfaces.rest.resources.UsuarioResource;

public class UsuarioResourceFromEntityAssembler {
    public static UsuarioResource toResourceFromEntity(Usuario entity) {
        return new UsuarioResource(entity.getId(), entity.getFullInfo(), entity.getRol()
        );

    }

}
