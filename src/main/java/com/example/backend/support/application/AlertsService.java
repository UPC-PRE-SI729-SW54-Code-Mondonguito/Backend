package com.example.backend.support.application;

import com.example.backend.support.domain.model.aggregates.Alerts;
import com.example.backend.support.domain.model.commands.CreateAlertCommand;
import com.example.backend.support.domain.model.commands.DeleteAlertCommand;
import com.example.backend.support.domain.model.commands.UpdateAlertCommand;
import com.example.backend.support.domain.services.AlertsCommandService;
import com.example.backend.support.infrastructure.persistence.jpa.repositories.AlertRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlertsService implements AlertsCommandService {
    private final AlertRepository alertRepository;

    public AlertsService(AlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    @Override
    public Optional<Alerts> handle(CreateAlertCommand command) {
        var alert = new Alerts(command);
        alertRepository.save(alert);
        return Optional.of(alert);
    }

    @Override
    public Optional<Alerts> handle(UpdateAlertCommand command) {
        return Optional.empty();
    }

    @Override
    public void handle(DeleteAlertCommand command) {

    }
}
