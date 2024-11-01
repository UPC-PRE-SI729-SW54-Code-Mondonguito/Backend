package com.example.backend.reservas.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record DescripcionEspacio(String descripcion, String ubicacion) {
    public DescripcionEspacio(){this(null, null);}

    public DescripcionEspacio {
        if (descripcion == null || descripcion.isBlank()){
            throw new IllegalArgumentException("Descripcion can't be null or empty");
        }
        if(ubicacion == null || ubicacion.isBlank()){
            throw new IllegalArgumentException("Ubicacion can't be null or empty");
        }
    }
}
