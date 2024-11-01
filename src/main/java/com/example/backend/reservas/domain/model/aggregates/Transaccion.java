package com.example.backend.reservas.domain.model.aggregates;

import com.example.backend.reservas.domain.model.commands.CreateTransaccionCommand;
import com.example.backend.reservas.domain.model.valueobjects.DatosTransaccion;
import com.example.backend.reservas.domain.model.valueobjects.EstadoTransaccion;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
            @AttributeOverrides({
                    @AttributeOverride(name = "monto",  column = @Column(name = "monto")),
                    @AttributeOverride(name = "fecha",  column = @Column(name = "fecha")),
                    @AttributeOverride(name = "metodo de pago",  column = @Column(name = "metodo_pago")),
            })
    DatosTransaccion datosTransaccion;
    EstadoTransaccion estadoTransaccion;


    public Transaccion() {}
    public Transaccion(DatosTransaccion datosTransaccion) {
        this.datosTransaccion = datosTransaccion;
        this.estadoTransaccion = EstadoTransaccion.PORPAGAR;

    }

    public Transaccion(CreateTransaccionCommand command) {
        this.datosTransaccion = command.datosTransaccion();
        this.estadoTransaccion = EstadoTransaccion.PORPAGAR;
    }
}
