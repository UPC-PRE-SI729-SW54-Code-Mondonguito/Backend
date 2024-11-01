package com.example.backend.reservas.domain.model.aggregates;

import com.example.backend.reservas.domain.model.commands.CreateReservaCommand;
import com.example.backend.reservas.domain.model.commands.UpdateReservaCommand;
import com.example.backend.reservas.domain.model.valueobjects.EstadoReserva;
import com.example.backend.reservas.domain.model.valueobjects.FechaReserva;
import com.example.backend.reservas.domain.model.valueobjects.HoraInicioFinal;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String name;

    @Embedded
    FechaReserva fechaReserva;

    @Embedded
    HoraInicioFinal horaInicioFinal;

    private EstadoReserva estadoReserva;

    @OneToOne
    Espacio espacio;

    public Reservas(String name) {}

    public Reservas(String name, FechaReserva fechaReserva, HoraInicioFinal horaInicioFinal, Espacio espacio) {
        this.name = name;
        this.fechaReserva = fechaReserva;
        this.horaInicioFinal = horaInicioFinal;
        this.espacio = espacio;
        this.estadoReserva = EstadoReserva.INACTIVA;
    }

    public Reservas(CreateReservaCommand command) {
        this.name = command.Name();
        this.espacio = command.espacio();
        this.fechaReserva = command.fecha();
        this.horaInicioFinal = command.hora();
    }

    public Reservas(UpdateReservaCommand command) {
        this.name = command.Name();
        this.espacio = command.espacio();
        this.fechaReserva = command.fecha();
        this.horaInicioFinal = command.hora();
    }

}
