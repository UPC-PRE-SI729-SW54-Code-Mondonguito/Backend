package com.example.backend.local.domain.services;

import com.example.backend.local.domain.model.aggregates.Opinion;
import com.example.backend.local.domain.model.commands.CreateOpinionCommnad;
import com.example.backend.local.domain.model.commands.DeleteOpinionCommand;
import com.example.backend.local.domain.model.commands.UpdateOpinionCommand;

import java.util.Optional;

public interface OpinionCommandService {
    Optional<Opinion> handle(CreateOpinionCommnad command);
    Optional<Opinion> handle(UpdateOpinionCommand command);

    Optional<Opinion> handle(DeleteOpinionCommand command);
}
