package com.example.backend.support.domain.services;

import com.example.backend.support.domain.model.aggregates.ServicioAlCliente;
import com.example.backend.support.domain.model.commands.CreateServicioAlClienteCommand;
import com.example.backend.support.domain.model.commands.UpdateServicioAlClienteCommand;
import com.example.backend.support.domain.model.commands.DeleteServicioAlClienteCommand;

import java.util.Optional;

public interface ServicioAlClienteCommandService {
    Optional<ServicioAlCliente> handle(CreateServicioAlClienteCommand command);
    Optional<ServicioAlCliente> handle(UpdateServicioAlClienteCommand command);
    void handle(DeleteServicioAlClienteCommand command);
}
