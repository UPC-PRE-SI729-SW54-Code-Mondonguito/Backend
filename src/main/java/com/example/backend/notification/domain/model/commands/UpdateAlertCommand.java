package com.example.backend.notification.domain.model.commands;

import com.example.backend.notification.domain.model.valueobjects.AlertStatus;

/**
 * Command to update an existing alert.
 */
public record UpdateAlertCommand(Long id, boolean isActive, AlertStatus status) {

    public UpdateAlertCommand {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Alert ID must be greater than zero");
        }
        if (status == null) {
            throw new IllegalArgumentException("Alert status cannot be null");
        }
    }
}
