package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Reservas;
import com.example.backend.reservas.domain.model.commands.CreateReservaCommand;
import com.example.backend.reservas.domain.model.commands.UpdateReservaCommand;
import com.example.backend.reservas.domain.services.ReservasCommandService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.ReservasRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservaCommandServiceImp implements ReservasCommandService {
    private final ReservasRepository reservasRepository;
    public ReservaCommandServiceImp(ReservasRepository reservasRepository) { this.reservasRepository = reservasRepository; }

    @Override
    public Optional<Reservas> handle(CreateReservaCommand command) {
        var reservasId = new Reservas(command.Name());
        reservasRepository.findById(reservasId.getId()).map(reservas -> {
            throw new IllegalArgumentException("Profile with email "+ reservas.getId() + " already exists");
        });
        var reservas = new Reservas(command);
        reservasRepository.save(reservas);
        return Optional.of(reservas);

    }

    public Optional<Reservas> handle(UpdateReservaCommand command) {
        var reservasId = new Reservas(command.Name());
        reservasRepository.findById(reservasId.getId()).map(reservas -> {
            throw new IllegalArgumentException("Profile with email "+ reservas.getId() + " already exists");
        });
        var reservas = new Reservas(command);
        reservasRepository.save(reservas);
        return Optional.of(reservas);

    }


}
