package com.example.backend.local.domain.model.queries;

public record GetLocalByOpinionIdQuery(String opinionId) {
    public GetLocalByOpinionIdQuery {
        if (opinionId == null || opinionId.isBlank()) {
            throw new IllegalArgumentException("opinionId is null or empty");
        }
    }
}
