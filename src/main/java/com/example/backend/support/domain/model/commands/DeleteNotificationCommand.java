package com.example.backend.support.domain.model.commands;

public record DeleteNotificationCommand(Long notificationId) {
    public DeleteNotificationCommand {
        if (notificationId == null || notificationId <= 0) {
            throw new IllegalArgumentException("Notification id must be a positive number");
        }
    }
}
