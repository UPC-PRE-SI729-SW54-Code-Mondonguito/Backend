package com.example.backend.support.domain.model.aggregates;

import com.example.backend.support.domain.model.commands.CreateAsesoriaCommand;
import com.example.backend.support.domain.model.commands.UpdateAsesoriaCommand;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Asesoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clienteId;
    private String asunto;

    public Asesoria() {}

    public Asesoria(CreateAsesoriaCommand command) {
        this.clienteId = command.clienteId();
        this.asunto = command.asunto();
    }

    public void updateFromCommand(UpdateAsesoriaCommand command) {
        this.clienteId = command.clienteId();
        this.asunto = command.asunto();
    }
}
