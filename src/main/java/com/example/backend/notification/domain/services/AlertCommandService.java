package com.example.backend.notification.domain.services;

import com.example.backend.notification.domain.model.aggregates.Alert;
import com.example.backend.notification.domain.model.commands.CreateAlertCommand;
import com.example.backend.notification.domain.model.commands.UpdateAlertCommand;

import java.util.Optional;

public interface AlertCommandService {
    Optional<Alert> handle(CreateAlertCommand command);
    Optional<Alert> handle(UpdateAlertCommand command);
}
