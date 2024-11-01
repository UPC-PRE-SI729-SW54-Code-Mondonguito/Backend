package com.example.backend.reservas.domain.model.aggregates;

import com.example.backend.reservas.domain.model.commands.AddEspacioCommand;
import com.example.backend.reservas.domain.model.valueobjects.DescripcionEspacio;
import com.example.backend.reservas.domain.model.valueobjects.EstadoReserva;
import jakarta.persistence.*;
import lombok.Getter;
/**
 * Represents a parking space with its description and reservation status.
 */
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
    /**
     * Default constructor for JPA.
     */
    public Espacio() {}

    /**
     * Constructs a new Espacio with the specified description.
     *
     * @param descripcionEspacio the description of the parking space
     */
    public Espacio(DescripcionEspacio descripcionEspacio) {
        this.descripcionEspacio = descripcionEspacio;
        this.estadoReserva = EstadoReserva.INACTIVA;
    }

    /**
     * Constructs a new Espacio based on the provided AddEspacioCommand.
     *
     * @param command the command containing the details of the parking space to be added
     */
    public Espacio(AddEspacioCommand command) {
        this.descripcionEspacio = command.espacioId().getDescripcionEspacio();
        this.estadoReserva = EstadoReserva.ACTIVA;
    }

}
