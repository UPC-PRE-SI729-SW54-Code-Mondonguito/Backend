package com.example.backend.support.domain.model.commands;

public record CreateNotificationCommand(String conductorId, String mensaje) {
    public CreateNotificationCommand {
        if (conductorId == null || conductorId.isEmpty()) {
            throw new IllegalArgumentException("Conductor ID cannot be null or empty");
        }
        if (mensaje == null || mensaje.isEmpty()) {
            throw new IllegalArgumentException("Mensaje cannot be null or empty");
        }
    }
}
