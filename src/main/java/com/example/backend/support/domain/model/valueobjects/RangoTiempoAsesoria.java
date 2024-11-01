package com.example.backend.support.domain.model.valueobjects;

import java.time.LocalTime;

public record RangoTiempoAsesoria(LocalTime inicio, LocalTime fin) {
    public RangoTiempoAsesoria {
        if (inicio == null || fin == null) {
            throw new IllegalArgumentException("inicio and fin can't be null");
        }
        if (inicio.isAfter(fin)) {
            throw new IllegalArgumentException("inicio must be before fin");
        }
    }
}
