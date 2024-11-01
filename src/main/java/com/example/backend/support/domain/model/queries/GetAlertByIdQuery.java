package com.example.backend.support.domain.model.queries;

public record GetAlertByIdQuery(Long alertId) {
    public GetAlertByIdQuery {
        if (alertId == null || alertId <= 0) {
            throw new IllegalArgumentException("alertId cannot be null or less than or equal to zero");
        }
    }
}
