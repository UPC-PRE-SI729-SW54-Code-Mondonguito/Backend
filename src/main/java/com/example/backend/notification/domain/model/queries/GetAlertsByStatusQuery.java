package com.example.backend.notification.domain.model.queries;

import com.example.backend.notification.domain.model.valueobjects.AlertStatus;

/**
 * Query to retrieve alerts by their status.
 */
public record GetAlertsByStatusQuery(AlertStatus status) {

    public GetAlertsByStatusQuery {
        if (status == null) {
            throw new IllegalArgumentException("Alert status cannot be null");
        }
    }
}
