package com.example.backend.notification.application;

import com.example.backend.notification.domain.model.aggregates.Alert;
import com.example.backend.notification.domain.model.commands.CreateAlertCommand;
import com.example.backend.notification.domain.model.commands.UpdateAlertCommand;
import com.example.backend.notification.domain.services.AlertCommandService;
import com.example.backend.notification.infrastructure.persistence.jpa.AlertRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service implementation for handling commands related to Alerts.
 */
@Service
public class AlertCommandServiceImp implements AlertCommandService {

    private final AlertRepository alertRepository;

    public AlertCommandServiceImp(AlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    @Override
    public Optional<Alert> handle(CreateAlertCommand command) {
        var alert = new Alert(command);
        alertRepository.save(alert);
        return Optional.of(alert);
    }

    @Override
    public Optional<Alert> handle(UpdateAlertCommand command) {
        return alertRepository.findById(command.id())
                .map(alert -> {
                    alert.updateStatus(command.status());
                    alertRepository.save(alert);
                    return alert;
                });
    }
}
