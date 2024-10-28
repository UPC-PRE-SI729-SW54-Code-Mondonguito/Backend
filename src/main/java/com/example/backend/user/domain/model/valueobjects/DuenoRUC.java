package com.example.backend.user.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record DuenoRUC(String RUC) {
    public DuenoRUC(){this(null);}

    public DuenoRUC {
        if (RUC == null || RUC.isEmpty()) {
            throw new IllegalArgumentException("RUC is required");
        }
    }



}
