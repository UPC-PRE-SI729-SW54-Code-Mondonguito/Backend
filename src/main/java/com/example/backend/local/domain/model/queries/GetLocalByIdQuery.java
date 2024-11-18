package com.example.backend.local.domain.model.queries;

public record GetLocalByIdQuery(String localId) {
    public GetLocalByIdQuery {
        if (localId == null || localId.isBlank()) {
            throw new IllegalArgumentException("localId is null or empty");
        }
    }
}
