package com.example.backend.reservas.domain.model.commands;

import com.example.backend.reservas.domain.model.valueobjects.DatosTransaccion;
import com.example.backend.reservas.domain.model.valueobjects.EstadoTransaccion;

public record CreateTransaccionCommand(DatosTransaccion datosTransaccion) {
    public CreateTransaccionCommand {
        if (datosTransaccion == null) {
            throw new IllegalArgumentException("Datos invalidos");
        }
    }
}
