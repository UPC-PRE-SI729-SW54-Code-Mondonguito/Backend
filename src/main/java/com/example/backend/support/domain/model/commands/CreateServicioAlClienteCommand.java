package com.example.backend.support.domain.model.commands;

public record CreateServicioAlClienteCommand(String clienteId, String asunto) {
    public CreateServicioAlClienteCommand {
        if (clienteId == null || clienteId.isEmpty()) {
            throw new IllegalArgumentException("Cliente ID cannot be null or empty");
        }
        if (asunto == null || asunto.isEmpty()) {
            throw new IllegalArgumentException("Asunto cannot be null or empty");
        }
    }
}
