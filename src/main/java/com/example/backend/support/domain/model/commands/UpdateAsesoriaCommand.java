package com.example.backend.support.domain.model.commands;

public record UpdateAsesoriaCommand(Long id, String clienteId, String asunto) {
    public UpdateAsesoriaCommand {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Asesoria id cannot be null or negative");
        }
        if (clienteId == null || clienteId.isEmpty()) {
            throw new IllegalArgumentException("ClienteId cannot be null or empty");
        }
        if (asunto == null || asunto.isEmpty()) {
            throw new IllegalArgumentException("Asunto cannot be null or empty");
        }
    }
}
