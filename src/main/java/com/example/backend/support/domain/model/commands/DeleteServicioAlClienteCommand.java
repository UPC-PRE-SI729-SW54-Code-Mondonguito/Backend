package com.example.backend.support.domain.model.commands;

public record DeleteServicioAlClienteCommand(Long servicioAlClienteId) {
    public DeleteServicioAlClienteCommand {
        if (servicioAlClienteId == null || servicioAlClienteId <= 0) {
            throw new IllegalArgumentException("ServicioAlCliente id must be a positive number");
        }
    }
}
