package com.example.backend.local.application.internal;

import com.example.backend.local.domain.model.aggregates.Local;
import com.example.backend.local.domain.model.commands.AddLocalCommand;
import com.example.backend.local.domain.model.commands.DeleteLocalCommand;
import com.example.backend.local.domain.model.commands.UpdateLocalCommand;
import com.example.backend.local.domain.services.LocalCommandService;
import com.example.backend.local.infrastructure.persistance.jpa.repositories.LocalRepository;

import java.util.Optional;

public class LocalCommandServiceImpl implements LocalCommandService {
    private final LocalRepository localRepository;
    public LocalCommandServiceImpl(LocalRepository localRepository) {this.localRepository = localRepository;}

    @Override
    public Optional<Local> handle(AddLocalCommand command) {
        var id = command.localId();
        localRepository.findById(id).ifPresent(existingLocal -> {
            throw new IllegalArgumentException("Local with ID " + id + " already exists");
        });
        var local = new Local(command);
        var createdLocal = localRepository.save(local);
        return Optional.of(createdLocal);
    }

    @Override
    public Optional<Local> handle(UpdateLocalCommand command) {
        var id = command.localId();
        var existingLocal = localRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Local with ID " + id + " does not exist"));

        existingLocal.updateFromCommand(command);
        var updatedLocal = localRepository.save(existingLocal);
        return Optional.of(updatedLocal);
    }

    @Override
    public Optional<Local> handle(DeleteLocalCommand command) {
        var id = command.LocalId();
        var existingLocal = localRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Local with ID " + id + " does not exist"));

        localRepository.delete(existingLocal);
        return Optional.of(existingLocal);
    }


}
