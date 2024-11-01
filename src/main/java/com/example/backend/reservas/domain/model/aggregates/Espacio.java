package com.example.backend.reservas.domain.model.aggregates;

import com.example.backend.reservas.domain.model.commands.AddEspacioCommand;
import com.example.backend.reservas.domain.model.valueobjects.DescripcionEspacio;
import com.example.backend.reservas.domain.model.valueobjects.EstadoReserva;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Espacio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "descriptcion",  column = @Column(name = "descriptcion")),
            @AttributeOverride(name = "ubicacion",  column = @Column(name = "ubicacion")),
    })
    DescripcionEspacio descripcionEspacio;

    EstadoReserva estadoReserva;

    public Espacio() {}

    public Espacio(DescripcionEspacio descripcionEspacio) {
        this.descripcionEspacio = descripcionEspacio;
        this.estadoReserva = EstadoReserva.INACTIVA;
    }

    public Espacio(AddEspacioCommand command) {
        this.descripcionEspacio = command.espacioId().getDescripcionEspacio();
        this.estadoReserva = EstadoReserva.ACTIVA;
    }

}
