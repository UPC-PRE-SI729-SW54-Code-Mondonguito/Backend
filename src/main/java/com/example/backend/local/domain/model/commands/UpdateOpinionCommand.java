package com.example.backend.local.domain.model.commands;

public record UpdateOpinionCommand(String opinionTitulo, String opinionDescripcion) {
    public UpdateOpinionCommand {
        if (opinionTitulo == null || opinionDescripcion == null || opinionTitulo.isBlank() || opinionDescripcion.isBlank()) {
            throw new IllegalArgumentException("OpinionTitulo and opinionDescripcion cannot be null or empty");

        }

    }
}
