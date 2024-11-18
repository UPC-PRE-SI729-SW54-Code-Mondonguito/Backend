package com.example.backend.local.domain.services;

import com.example.backend.local.domain.model.aggregates.Local;
import com.example.backend.local.domain.model.commands.AddLocalCommand;
import com.example.backend.local.domain.model.commands.DeleteLocalCommand;
import com.example.backend.local.domain.model.commands.UpdateLocalCommand;

import java.util.Optional;

public interface LocalCommandService {
    Optional<Local> handle(AddLocalCommand command);
    Optional<Local> handle(UpdateLocalCommand command);
    Optional<Local> handle(DeleteLocalCommand command);
}
