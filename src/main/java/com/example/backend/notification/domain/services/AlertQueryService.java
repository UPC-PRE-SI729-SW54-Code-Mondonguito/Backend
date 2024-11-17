package com.example.backend.notification.domain.services;

import com.example.backend.notification.domain.model.aggregates.Alert;
import com.example.backend.notification.domain.model.queries.GetAlertByIdQuery;
import com.example.backend.notification.domain.model.queries.GetAlertsByStatusQuery;

import java.util.List;
import java.util.Optional;

public interface AlertQueryService {
    Optional<Alert> handle(GetAlertByIdQuery query);
    List<Alert> handle(GetAlertsByStatusQuery query);
}
