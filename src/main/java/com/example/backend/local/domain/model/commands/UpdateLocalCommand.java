package com.example.backend.local.domain.model.commands;

import com.example.backend.local.domain.model.aggregates.Opinion;

public record UpdateLocalCommand(Long localId, String localName, String description, String ubicacion, Opinion opinion) {
    public UpdateLocalCommand {
        if(localId == null && localName == null && description == null && ubicacion == null && opinion == null) {
            throw new IllegalArgumentException("LocalId, LocalName, description, ubicacion are required");
        }

    }
}
