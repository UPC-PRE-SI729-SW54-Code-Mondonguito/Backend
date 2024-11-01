package com.example.backend.support.domain.model.commands;

import com.example.backend.support.domain.model.aggregates.ServicioAlCliente;

public record UpdateServicioAlClienteCommand(Long servicioAlClienteId, ServicioAlCliente servicioAlCliente) {
    public UpdateServicioAlClienteCommand {
        if (servicioAlClienteId == null || servicioAlClienteId <= 0) {
            throw new IllegalArgumentException("ServicioAlCliente id must be a positive number");
        }
        if (servicioAlCliente == null) {
            throw new IllegalArgumentException("ServicioAlCliente cannot be null");
        }
    }
}
