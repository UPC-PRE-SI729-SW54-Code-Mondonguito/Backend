package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Espacio;
import com.example.backend.reservas.domain.model.commands.AddEspacioCommand;
import com.example.backend.reservas.domain.services.EspacioCommandService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.EspacioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service for handling commands related to Space creation.
 */
@Service
public class EspacioCommandServiceImp implements EspacioCommandService {

    private final EspacioRepository espacioRepository;

    // Constructor for injecting the Space repository
    public EspacioCommandServiceImp(EspacioRepository espacioRepository) {
        this.espacioRepository = espacioRepository;
    }

    /**
     * Processes AddEspacioCommand to create a new Space.
     *
     * @param command Contains data for new Space creation.
     * @return Optional containing the created Space.
     * @throws IllegalArgumentException if Space ID already exists.
     */
    @Override
    public Optional<Espacio> handle(AddEspacioCommand command) {
        // Check if Space ID already exists
        var spaceId = new Espacio(command.espacioId().getDescripcionEspacio());
        espacioRepository.findById(spaceId.getId()).ifPresent(space -> {
            throw new IllegalArgumentException("Space with ID " + spaceId.getId() + " already exists");
        });

        // Create and save the new Space
        var space = new Espacio(command);
        espacioRepository.save(space);

        // Return the created Space
        return Optional.of(space);
    }
}
