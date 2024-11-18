package com.example.backend.local.domain.model.aggregates;

import com.example.backend.local.domain.model.commands.AddLocalCommand;
import com.example.backend.local.domain.model.commands.UpdateLocalCommand;
import com.example.backend.local.domain.model.valueobjects.Descripcion;
import com.example.backend.local.domain.model.valueobjects.Nombre;
import com.example.backend.local.domain.model.valueobjects.Ubicacion;
import com.example.backend.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
public class Local extends AuditableAbstractAggregateRoot<Local> {
    @Getter
    @OneToMany
    @JoinColumn(name = "opinion_id")
    private List<Opinion> opinions;

    @Getter
    @Embedded
    private Nombre nombre;

    @Getter
    @Embedded
    private Descripcion descripcion;

    @Getter
    @Embedded
    private Ubicacion ubicacion;

    public Local() {

    }

    public Local(Nombre nombre, Descripcion descripcion, Ubicacion ubicacion, List<Opinion> opinions) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.opinions = opinions;

    }


    public Local(AddLocalCommand command) {
        super();
    }

    public void updateFromCommand(UpdateLocalCommand command) {


    }
}
