package com.example.backend.local.domain.model.queries;

public record GetLocalByNameIdQuery(String localName) {
    public GetLocalByNameIdQuery {
        if (localName == null || localName.isBlank()) {
            throw new IllegalArgumentException("localName is null or empty");
        }
    }
}
