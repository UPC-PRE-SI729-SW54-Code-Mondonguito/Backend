package com.example.backend.reservas.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

import java.sql.Time;

@Embeddable
public record HoraInicioFinal(Time horaInicio, Time horaFinal) {
    public HoraInicioFinal() {this(null,null);}

    public HoraInicioFinal {
        if (horaInicio == null && horaFinal == null) {
            throw new IllegalArgumentException("HoraInicio and HoraFinal must not be null");
        }

    }
}
