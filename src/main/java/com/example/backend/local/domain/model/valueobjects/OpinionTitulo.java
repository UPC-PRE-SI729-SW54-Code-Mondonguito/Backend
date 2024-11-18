package com.example.backend.local.domain.model.valueobjects;

public record OpinionTitulo(String opiniontitulo) {
    public OpinionTitulo {
        if (opiniontitulo == null || opiniontitulo.isBlank()) {
            throw new IllegalArgumentException("opiniontitulo is null or empty");

        }

    }


}
