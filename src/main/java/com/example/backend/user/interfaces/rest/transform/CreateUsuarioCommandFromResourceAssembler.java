package com.example.backend.user.interfaces.rest.transform;

import com.example.backend.user.domain.model.commands.CreateUsusarioCommand;
import com.example.backend.user.interfaces.rest.resources.CreateUsuarioResource;

public class CreateUsuarioCommandFromResourceAssembler {

    public static CreateUsusarioCommand toCommandFromResource(CreateUsuarioResource resource) {
        return new CreateUsusarioCommand(resource.fullname(), resource.age(), resource.dni(), resource.rol());
    }
}
