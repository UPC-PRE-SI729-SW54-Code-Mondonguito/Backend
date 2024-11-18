package com.example.backend.local.domain.model.commands;

import com.example.backend.local.domain.model.aggregates.Local;

public record AddLocalCommand(Local localId) {
    public AddLocalCommand {
        if(localId == null || localId.getId() == null || localId.getId().isEmpty()) {
            throw new IllegalArgumentException("Invalid local id");
        }
    }
}
