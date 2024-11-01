package com.example.backend.support.domain.services;

import com.example.backend.support.domain.model.aggregates.Asesoria;
import com.example.backend.support.domain.model.commands.CreateAsesoriaCommand;
import com.example.backend.support.domain.model.commands.UpdateAsesoriaCommand;
import com.example.backend.support.domain.model.commands.DeleteAsesoriaCommand;

import java.util.Optional;

public interface AsesoriaCommandService {
    Optional<Asesoria> handle(CreateAsesoriaCommand command);
    Optional<Asesoria> handle(UpdateAsesoriaCommand command);
    void handle(DeleteAsesoriaCommand command);
}
