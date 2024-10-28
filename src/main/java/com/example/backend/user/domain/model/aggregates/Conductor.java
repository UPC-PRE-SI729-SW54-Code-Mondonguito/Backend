package com.example.backend.user.domain.model.aggregates;

import com.example.backend.user.domain.model.valueobjects.ConductorPlaca;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Conductor extends Usuario{
    @Embedded
    ConductorPlaca placa;

    public Conductor(){}

    public Conductor(ConductorPlaca placa){
        this.placa = placa;
    }
}
