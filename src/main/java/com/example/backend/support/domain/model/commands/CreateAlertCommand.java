package com.example.backend.support.domain.model.commands;

public record CreateAlertCommand(String mensaje) {
    public CreateAlertCommand {
        if (mensaje == null || mensaje.isEmpty()) {
            throw new IllegalArgumentException("Mensaje cannot be null or empty");
        }
    }
}
