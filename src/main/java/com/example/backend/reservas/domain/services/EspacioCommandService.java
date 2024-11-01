package com.example.backend.reservas.domain.services;

import com.example.backend.reservas.domain.model.aggregates.Espacio;
import com.example.backend.reservas.domain.model.commands.AddEspacioCommand;

import java.util.Optional;

public interface EspacioCommandService {
    Optional<Espacio> handle(AddEspacioCommand command);
}
