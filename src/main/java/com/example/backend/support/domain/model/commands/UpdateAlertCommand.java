package com.example.backend.support.domain.model.commands;

import com.example.backend.support.domain.model.aggregates.Alerts;

public record UpdateAlertCommand(Long alertId, Alerts alert) {
    public UpdateAlertCommand {
        if (alertId == null || alertId <= 0) {
            throw new IllegalArgumentException("Alert id must be a positive number");
        }
        if (alert == null) {
            throw new IllegalArgumentException("Alert cannot be null");
        }
    }
}
