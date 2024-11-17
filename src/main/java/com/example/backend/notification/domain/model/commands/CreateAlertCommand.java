package com.example.backend.notification.domain.model.commands;

import com.example.backend.notification.domain.model.valueobjects.AlertStatus;

/**
 * Command to create a new alert.
 */
public record CreateAlertCommand(boolean isActive, AlertStatus status) {
    public CreateAlertCommand {
        if (status == null) {
            throw new IllegalArgumentException("Alert status cannot be null");
        }
    }
}
