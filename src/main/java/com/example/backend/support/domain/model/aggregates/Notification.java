package com.example.backend.support.domain.model.aggregates;

import com.example.backend.support.domain.model.commands.CreateNotificationCommand;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String conductorId;
    private String mensaje;
    private boolean leido;

    public Notification() {}

    public Notification(String conductorId, String mensaje) {
        this.conductorId = conductorId;
        this.mensaje = mensaje;
        this.leido = false;
    }

    public Notification(CreateNotificationCommand command) {
        this.conductorId = command.conductorId();
        this.mensaje = command.mensaje();
        this.leido = false;
    }

    public void marcarComoLeido() {
        this.leido = true;
    }
}
