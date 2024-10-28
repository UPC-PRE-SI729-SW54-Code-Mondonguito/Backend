package com.example.backend.user.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record ConductorPlaca(String placa_vehicular) {
    public ConductorPlaca(){this(null);}

    public ConductorPlaca {
        if (placa_vehicular == null || placa_vehicular.isEmpty()) {
            throw new IllegalArgumentException("Placa is required");
        }
    }
}
