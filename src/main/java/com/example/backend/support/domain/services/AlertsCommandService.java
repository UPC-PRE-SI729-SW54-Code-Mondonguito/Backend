package com.example.backend.support.domain.services;

import com.example.backend.support.domain.model.aggregates.Alerts;
import com.example.backend.support.domain.model.commands.CreateAlertCommand;
import com.example.backend.support.domain.model.commands.UpdateAlertCommand;
import com.example.backend.support.domain.model.commands.DeleteAlertCommand;

import java.util.Optional;

public interface AlertsCommandService {
    Optional<Alerts> handle(CreateAlertCommand command);
    Optional<Alerts> handle(UpdateAlertCommand command);
    void handle(DeleteAlertCommand command);
}
