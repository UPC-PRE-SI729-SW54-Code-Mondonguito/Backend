package com.example.backend.local.domain.model.queries;

public record GetOpinionByIdQuery(Long opinionId) {
    public GetOpinionByIdQuery {
        if (opinionId == null || opinionId == 0) {
            throw new IllegalArgumentException("opinionId is null or empty");
        }
    }
}
