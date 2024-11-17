package com.example.backend.notification.domain.model.queries;

/**
 * Query to retrieve an alert by its ID.
 */
public record GetAlertByIdQuery(Long id) {

    public GetAlertByIdQuery {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Alert ID must be greater than zero");
        }
    }
}
