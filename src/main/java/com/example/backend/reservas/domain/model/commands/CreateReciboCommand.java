package com.example.backend.reservas.domain.model.commands;

import com.example.backend.reservas.domain.model.aggregates.Recibo;
import com.example.backend.reservas.domain.model.aggregates.Transaccion;

public record CreateReciboCommand(Transaccion transaccion) {
    public CreateReciboCommand {
        if(transaccion == null || transaccion.getId() == null){
            throw new IllegalArgumentException("Transaccion id cannot be null");
        }
    }
}
