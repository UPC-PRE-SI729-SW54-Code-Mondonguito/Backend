package com.example.backend.local.domain.model.aggregates;

import com.example.backend.local.domain.model.commands.CreateOpinionCommnad;
import com.example.backend.local.domain.model.commands.UpdateOpinionCommand;
import com.example.backend.local.domain.model.valueobjects.*;
import com.example.backend.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Opinion extends AuditableAbstractAggregateRoot<Opinion> {

    @Getter
    @Embedded
    private OpinionTitulo titulo;

    @Getter
    @Embedded
    private OpinionDescripcion descripcion;

    @Getter
    @ManyToOne
    @JoinColumn(name = "local_id")
    private Local local;

    public Opinion() {}

    public Opinion(OpinionTitulo titulo, OpinionDescripcion descripcion, Local local) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.local = local;
    }


    public Opinion(CreateOpinionCommnad command) {
        super();
    }

    public void updateFromCommand(UpdateOpinionCommand command) {
    }
}
