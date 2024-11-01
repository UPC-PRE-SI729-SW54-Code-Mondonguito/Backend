package com.example.backend.reservas.domain.services;

import com.example.backend.reservas.domain.model.aggregates.Transaccion;
import com.example.backend.reservas.domain.model.commands.CreateTransaccionCommand;

import java.util.Optional;

public interface TransaccionCommandService {
    Optional<Transaccion> handle(CreateTransaccionCommand command);
}
