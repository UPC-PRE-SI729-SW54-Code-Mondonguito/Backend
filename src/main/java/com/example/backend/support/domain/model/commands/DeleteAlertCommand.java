package com.example.backend.support.domain.model.commands;

public record DeleteAlertCommand(Long alertId) {
    public DeleteAlertCommand {
        if (alertId == null || alertId <= 0) {
            throw new IllegalArgumentException("Alert id must be a positive number");
        }
    }
}
