package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Transaccion;
import com.example.backend.reservas.domain.model.commands.CreateTransaccionCommand;

import com.example.backend.reservas.domain.services.TransaccionCommandService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.TransaccionRepository;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransaccionCommandServiceImp implements TransaccionCommandService {
    private final TransaccionRepository transaccionRepository;

    public TransaccionCommandServiceImp(TransaccionRepository transaccionRepository) { this.transaccionRepository = transaccionRepository;}

    @Override
    public Optional<Transaccion> handle(CreateTransaccionCommand command) {
        var datosTransaccion = new Transaccion(command.datosTransaccion());
        transaccionRepository.findById(datosTransaccion.getId()).map(transaccion -> {
           throw new IllegalArgumentException("Profile with email "+ transaccion.getId() + " already exists");
        });
        var transaccion = new Transaccion(command);
        var createdTransaccion = transaccionRepository.save(transaccion);
        return Optional.of(createdTransaccion);
    }
}
