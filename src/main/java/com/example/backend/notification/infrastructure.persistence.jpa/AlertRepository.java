package com.example.backend.notification.infrastructure.persistence.jpa;

import com.example.backend.notification.domain.model.aggregates.Alert;
import com.example.backend.notification.domain.model.valueobjects.AlertStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Repository for managing Alert entities.
 */
public interface AlertRepository extends JpaRepository<Alert, Long> {
    List<Alert> findByStatus(AlertStatus status);
}