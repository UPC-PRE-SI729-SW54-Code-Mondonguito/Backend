package com.example.backend.reservas.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

import java.util.Date;

@Embeddable
public record FechaReserva(Date fechaReserva) {
   public FechaReserva(){this(null);}
    public FechaReserva {
       if(fechaReserva == null){
           throw new IllegalArgumentException("fechaReserva can't be null");
       }
    }
}
