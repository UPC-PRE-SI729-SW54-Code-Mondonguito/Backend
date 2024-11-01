package com.example.backend.reservas.domain.services;

import com.example.backend.reservas.domain.model.aggregates.Recibo;
import com.example.backend.reservas.domain.model.commands.CreateReciboCommand;

import java.util.Optional;

public interface ReciboCommandService {
    Optional<Recibo> handle(CreateReciboCommand command);
}
