package com.example.backend.support.domain.model.commands;

public record CreateAsesoriaCommand(String clienteId, String asunto) {
    public CreateAsesoriaCommand {
        if (clienteId == null || clienteId.isEmpty()) {
            throw new IllegalArgumentException("ClienteId cannot be null or empty");
        }
        if (asunto == null || asunto.isEmpty()) {
            throw new IllegalArgumentException("Asunto cannot be null or empty");
        }
    }
}
