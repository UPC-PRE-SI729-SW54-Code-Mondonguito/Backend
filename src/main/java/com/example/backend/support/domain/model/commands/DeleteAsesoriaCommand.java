package com.example.backend.support.domain.model.commands;

public record DeleteAsesoriaCommand(Long id) {
    public DeleteAsesoriaCommand {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Asesoria id cannot be null or negative");
        }
    }
}
