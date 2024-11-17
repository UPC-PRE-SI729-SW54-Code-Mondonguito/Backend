package com.example.backend.notification.domain.model.valueobjects;

/**
 * Value object representing the details of a notification.
 */
public record NotificationDetails(String description, int userId) {

    public NotificationDetails {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be null or blank");
        }
        if (userId <= 0) {
            throw new IllegalArgumentException("User ID must be greater than zero");
        }
    }
}
