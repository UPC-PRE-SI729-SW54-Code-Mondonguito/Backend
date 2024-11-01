package com.example.backend.support.domain.model.aggregates;

import com.example.backend.support.domain.model.commands.CreateServicioAlClienteCommand;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class ServicioAlCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clienteId;
    private String asunto;

    public ServicioAlCliente() {}

    public ServicioAlCliente(String clienteId, String asunto) {
        this.clienteId = clienteId;
        this.asunto = asunto;
    }

    public ServicioAlCliente(CreateServicioAlClienteCommand command) {
        this.clienteId = command.clienteId();
        this.asunto = command.asunto();
    }
}
