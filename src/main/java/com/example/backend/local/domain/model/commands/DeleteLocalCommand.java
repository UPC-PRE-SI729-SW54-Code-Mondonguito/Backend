package com.example.backend.local.domain.model.commands;

public record DeleteLocalCommand(Long LocalId) {
    public DeleteLocalCommand {
        if (LocalId == null && LocalId <= 0) {
            throw new IllegalArgumentException("Local id cannot be null or empty");
        }
    }
}
