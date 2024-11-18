package com.example.backend.local.application.internal;

import com.example.backend.local.domain.model.aggregates.Opinion;
import com.example.backend.local.domain.model.commands.CreateOpinionCommnad;
import com.example.backend.local.domain.model.commands.DeleteOpinionCommand;
import com.example.backend.local.domain.model.commands.UpdateOpinionCommand;
import com.example.backend.local.domain.services.OpinionCommandService;
import com.example.backend.local.infrastructure.persistance.jpa.repositories.OpinionRepository;

import java.util.Optional;

public class OpinionCommandServiceImpl implements OpinionCommandService {

    private final OpinionRepository opinionRepository;

    public OpinionCommandServiceImpl(final OpinionRepository opinionRepository) {this.opinionRepository = opinionRepository;}

    @Override
    public Optional<Opinion> handle(CreateOpinionCommnad command) {
        var id = command.titulo();
        opinionRepository.findByTitle(id).ifPresent(existingLocal -> {
            throw new IllegalArgumentException("Local with ID " + id + " already exists");
        });
        var local = new Opinion(command);
        var createdLocal = opinionRepository.save(local);
        return Optional.of(createdLocal);
    }

    @Override
    public Optional<Opinion> handle(UpdateOpinionCommand command) {
        var id = command.opinionTitulo();
        var existingLocal = opinionRepository.findByTitle(id)
                .orElseThrow(() -> new IllegalArgumentException("Local with ID " + id + " does not exist"));

        existingLocal.updateFromCommand(command);
        var updatedLocal = opinionRepository.save(existingLocal);
        return Optional.of(updatedLocal);
    }

    @Override
    public Optional<Opinion> handle(DeleteOpinionCommand command) {
        var id = command.opinionId();
        var existingLocal = opinionRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Local with ID " + id + " does not exist"));

        opinionRepository.delete(existingLocal);
        return Optional.of(existingLocal);
    }
}
