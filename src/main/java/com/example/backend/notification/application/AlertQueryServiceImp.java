package com.example.backend.notification.application;

import com.example.backend.notification.domain.model.aggregates.Alert;
import com.example.backend.notification.domain.model.queries.GetAlertByIdQuery;
import com.example.backend.notification.domain.model.queries.GetAlertsByStatusQuery;
import com.example.backend.notification.domain.services.AlertQueryService;
import com.example.backend.notification.infrastructure.persistence.jpa.AlertRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for handling queries related to Alerts.
 */
@Service
public class AlertQueryServiceImp implements AlertQueryService {

    private final AlertRepository alertRepository;

    public AlertQueryServiceImp(AlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    @Override
    public Optional<Alert> handle(GetAlertByIdQuery query) {
        return alertRepository.findById(query.id());
    }

    @Override
    public List<Alert> handle(GetAlertsByStatusQuery query) {
        return alertRepository.findByStatus(query.status());
    }
}
