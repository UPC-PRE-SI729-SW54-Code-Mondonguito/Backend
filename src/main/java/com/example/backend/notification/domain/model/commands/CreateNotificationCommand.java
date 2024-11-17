package com.example.backend.notification.domain.model.commands;

import com.example.backend.notification.domain.model.valueobjects.NotificationDetails;
import com.example.backend.notification.domain.model.valueobjects.DateAndTime;

/**
 * Command to create a new notification.
 */
public record CreateNotificationCommand(NotificationDetails details, DateAndTime timestamp) {

    public CreateNotificationCommand {
        if (details == null) {
            throw new IllegalArgumentException("Notification details cannot be null");
        }
        if (timestamp == null) {
            throw new IllegalArgumentException("Timestamp cannot be null");
        }
    }
}