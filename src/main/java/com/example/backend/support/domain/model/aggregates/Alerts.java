package com.example.backend.support.domain.model.aggregates;

import com.example.backend.support.domain.model.commands.CreateAlertCommand;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Alerts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensaje;
    private boolean activo;

    public Alerts() {}

    public Alerts(String mensaje) {
        this.mensaje = mensaje;
        this.activo = true;
    }

    public Alerts(CreateAlertCommand command) {
        this.mensaje = command.mensaje();
        this.activo = true;
    }

    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }
}
