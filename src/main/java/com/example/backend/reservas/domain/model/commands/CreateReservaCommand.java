package com.example.backend.reservas.domain.model.commands;

import com.example.backend.reservas.domain.model.aggregates.Espacio;
import com.example.backend.reservas.domain.model.valueobjects.FechaReserva;
import com.example.backend.reservas.domain.model.valueobjects.HoraInicioFinal;

public record CreateReservaCommand(String Name, FechaReserva fecha, HoraInicioFinal hora, Espacio espacio) {
    public CreateReservaCommand {
        if (Name == null || Name.isEmpty() ) {
            throw new IllegalArgumentException("Nombre del Reserva no puede ser nulo");
        }
        if (fecha == null) {
            throw new IllegalArgumentException("Fecha del Reserva no puede ser nulo");
        }
        if (hora == null) {
            throw new IllegalArgumentException("Hora del Reserva no puede ser nulo");
        }
        if (espacio == null) {
            throw new IllegalArgumentException("Espacio del Reserva no puede ser nulo");
        }
    }
}
