package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Espacio;
import com.example.backend.reservas.domain.model.commands.AddEspacioCommand;
import com.example.backend.reservas.domain.services.EspacioCommandService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.EspacioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EspacioCommandServiceImp implements EspacioCommandService {
    private final EspacioRepository espacioRepository;
    public EspacioCommandServiceImp(EspacioRepository espacioRepository) {this.espacioRepository = espacioRepository;}

    @Override
    public Optional<Espacio> handle(AddEspacioCommand command) {
        var espacioId = new Espacio(command.espacioId().getDescripcionEspacio());
        espacioRepository.findById(espacioId.getId()).map(espacio -> {
            throw new IllegalArgumentException("Profile with email "+ espacioId.getId() + " already exists");
        });
        var espacio = new Espacio(command);
        espacioRepository.save(espacio);
        return Optional.of(espacio);
    }

}
