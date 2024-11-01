package com.example.backend.reservas.domain.model.aggregates;

import com.example.backend.reservas.domain.model.commands.CreateReciboCommand;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Recibo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    Transaccion transaccion;
    public Recibo() {
    }

    public Recibo(Transaccion transaccion) {
        this.transaccion = transaccion;
    }


    public Recibo(CreateReciboCommand command) {
        this.id = command.transaccion().getId();
    }
}
