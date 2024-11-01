package com.example.backend.reservas.domain.services;

import com.example.backend.reservas.domain.model.aggregates.Reservas;
import com.example.backend.reservas.domain.model.commands.CreateReservaCommand;
import com.example.backend.reservas.domain.model.commands.UpdateReservaCommand;

import java.util.Optional;

public interface ReservasCommandService {
    Optional<Reservas> handle(CreateReservaCommand command);
    Optional<Reservas> handle(UpdateReservaCommand command);


}
