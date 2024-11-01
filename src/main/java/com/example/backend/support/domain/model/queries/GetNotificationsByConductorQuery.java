package com.example.backend.support.domain.model.queries;

public record GetNotificationsByConductorQuery(Long conductorId) {
    public GetNotificationsByConductorQuery {
        if (conductorId == null || conductorId <= 0) {
            throw new IllegalArgumentException("conductorId cannot be null or less than or equal to zero");
        }
    }
}
