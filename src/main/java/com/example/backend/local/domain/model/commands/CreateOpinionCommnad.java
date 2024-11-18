package com.example.backend.local.domain.model.commands;

import com.example.backend.local.domain.model.aggregates.Local;

public record CreateOpinionCommnad(String titulo, String descripcion, Local local) {
    public CreateOpinionCommnad {
       if(titulo == null || local.getId() == null || descripcion == null || descripcion.isBlank()) {
           throw new IllegalArgumentException("Titulo and local cannot be null");
       }

    }
}
