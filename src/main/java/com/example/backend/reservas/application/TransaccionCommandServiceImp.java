package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Transaccion;
import com.example.backend.reservas.domain.model.commands.CreateTransaccionCommand;

import com.example.backend.reservas.domain.services.TransaccionCommandService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.TransaccionRepository;

import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service implementation for handling commands related to Transacciones.
 */
@Service
public class TransaccionCommandServiceImp implements TransaccionCommandService {
    private final TransaccionRepository transaccionRepository;

    /**
     * Constructs a new TransaccionCommandServiceImp with the specified TransaccionRepository.
     *
     * @param transaccionRepository the repository to be used for accessing Transaccion data
     */
    public TransaccionCommandServiceImp(TransaccionRepository transaccionRepository) { this.transaccionRepository = transaccionRepository;}

    /**
     * Handles the CreateTransaccionCommand to create a new Transaccion.
     *
     * @param command the command containing the details of the Transaccion to be created
     * @return an Optional containing the created Transaccion if successful, or an empty Optional if not
     */
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
