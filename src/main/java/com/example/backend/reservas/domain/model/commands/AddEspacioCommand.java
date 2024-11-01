package com.example.backend.reservas.domain.model.commands;

import com.example.backend.reservas.domain.model.aggregates.Espacio;

public record AddEspacioCommand(Espacio espacioId) {
    public AddEspacioCommand {
        if (espacioId == null || espacioId.getId() <= 0) {
            throw new IllegalArgumentException("Espacio id cannot be null or empty");
        }

    }
}
