package com.example.backend.notification.domain.model.queries;

/**
 * Query to retrieve notifications by a user's ID.
 */
public record GetNotificationsByUserQuery(Long userId) {

    public GetNotificationsByUserQuery {
        if (userId == null || userId <= 0) {
            throw new IllegalArgumentException("User ID must be greater than zero");
        }
    }
}
