package com.example.backend.support.domain.model.commands;

import com.example.backend.support.domain.model.aggregates.Notification;

public record UpdateNotificationCommand(Long notificationId, Notification notification) {
    public UpdateNotificationCommand {
        if (notificationId == null || notificationId <= 0) {
            throw new IllegalArgumentException("Notification id must be a positive number");
        }
        if (notification == null) {
            throw new IllegalArgumentException("Notification cannot be null");
        }
    }
}
