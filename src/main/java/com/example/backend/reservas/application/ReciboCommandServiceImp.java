package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Espacio;
import com.example.backend.reservas.domain.model.aggregates.Recibo;
import com.example.backend.reservas.domain.model.commands.CreateReciboCommand;
import com.example.backend.reservas.domain.services.ReciboCommandService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.ReciboRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

// This service implementation handles commands related to the Recibo entity.
@Service
public class ReciboCommandServiceImp implements ReciboCommandService {
    private final ReciboRepository reciboRepository;

    // Constructor injection of the ReciboRepository.
    public ReciboCommandServiceImp(ReciboRepository reciboRepository) {
        this.reciboRepository = reciboRepository;
    }

    // Handles the command to create a new Recibo.
    @Override
    public Optional<Recibo> handle(CreateReciboCommand command) {
        // Create a new Recibo instance based on the provided command.
        var recibo = new Recibo(command);
        
        // Check if a Recibo with the same transaction ID already exists.
        reciboRepository.findById(command.transaccion().getId()).map(reciboId -> {
            // Throw an exception if a Recibo with the same transaction ID is found.
            throw new IllegalArgumentException("Profile with email " + reciboId.getTransaccion().getId() + " already exists");
        });
        
        // Create a new instance of Recibo to save.
        var Newrecibo = new Recibo(command);
        
        // Save the new Recibo to the repository.
        reciboRepository.save(Newrecibo);
        
        // Return the saved Recibo wrapped in an Optional.
        return Optional.of(Newrecibo);
    }
}
