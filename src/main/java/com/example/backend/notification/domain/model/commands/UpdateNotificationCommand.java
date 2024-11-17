package com.example.backend.notification.domain.model.commands;

import com.example.backend.notification.domain.model.valueobjects.NotificationDetails;
import com.example.backend.notification.domain.model.valueobjects.DateAndTime;

/**
 * Command to update an existing notification.
 */
public record UpdateNotificationCommand(Long id, NotificationDetails details, DateAndTime timestamp) {

    public UpdateNotificationCommand {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Notification ID must be greater than zero");
        }
        if (details == null) {
            throw new IllegalArgumentException("Notification details cannot be null");
        }
        if (timestamp == null) {
            throw new IllegalArgumentException("Timestamp cannot be null");
        }
    }
}
