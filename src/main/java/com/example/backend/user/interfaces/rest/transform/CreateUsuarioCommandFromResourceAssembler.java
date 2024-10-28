package com.example.backend.user.interfaces.rest.transform;

import com.example.backend.user.domain.model.commands.CreateUsuarioCommand;
import com.example.backend.user.interfaces.rest.resources.CreateUsuarioResource;

public class CreateUsuarioCommandFromResourceAssembler {

    public static CreateUsuarioCommand toCommandFromResource(CreateUsuarioResource resource) {
        return new CreateUsuarioCommand(resource.fullname(), resource.age(), resource.dni(), resource.rol());
    }
}
