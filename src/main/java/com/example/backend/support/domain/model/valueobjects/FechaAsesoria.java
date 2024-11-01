package com.example.backend.support.domain.model.valueobjects;

import java.time.LocalDate;

public record FechaAsesoria(LocalDate fecha) {
    public FechaAsesoria {
        if (fecha == null) {
            throw new IllegalArgumentException("fecha can't be null");
        }
    }
}
