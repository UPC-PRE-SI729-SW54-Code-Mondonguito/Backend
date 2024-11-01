package com.example.backend.support.application;

import com.example.backend.support.domain.model.aggregates.Asesoria;
import com.example.backend.support.domain.model.commands.CreateAsesoriaCommand;
import com.example.backend.support.domain.model.commands.DeleteAsesoriaCommand;
import com.example.backend.support.domain.model.commands.UpdateAsesoriaCommand;
import com.example.backend.support.domain.services.AsesoriaCommandService;
import com.example.backend.support.infrastructure.persistence.jpa.repositories.AsesoriaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AsesoriasService implements AsesoriaCommandService {
    private final AsesoriaRepository asesoriaRepository;

    public AsesoriasService(AsesoriaRepository asesoriaRepository) {
        this.asesoriaRepository = asesoriaRepository;
    }

    @Override
    public Optional<Asesoria> handle(CreateAsesoriaCommand command) {
        var asesoria = new Asesoria(command);
        asesoriaRepository.save(asesoria);
        return Optional.of(asesoria);
    }

    @Override
    public Optional<Asesoria> handle(UpdateAsesoriaCommand command) {
        return asesoriaRepository.findById(command.id()).map(asesoria -> {
            asesoria.updateFromCommand(command);
            asesoriaRepository.save(asesoria);
            return asesoria; // Cambiado a solo retornar `asesoria`
        });
    }
    @Override
    public void handle(DeleteAsesoriaCommand command) {
        asesoriaRepository.deleteById(command.id());
    }
}




