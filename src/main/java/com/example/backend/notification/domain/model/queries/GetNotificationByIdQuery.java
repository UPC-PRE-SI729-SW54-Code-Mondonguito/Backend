package com.example.backend.notification.domain.model.queries;

/**
 * Query to retrieve a notification by its ID.
 */
public record GetNotificationByIdQuery(Long id) {

    public GetNotificationByIdQuery {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Notification ID must be greater than zero");
        }
    }
}
