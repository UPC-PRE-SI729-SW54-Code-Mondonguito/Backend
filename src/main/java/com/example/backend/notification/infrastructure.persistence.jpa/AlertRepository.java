package com.example.backend.notification.infrastructure.persistence.jpa;

import com.example.backend.notification.domain.model.aggregates.Alert;
import com.example.backend.notification.domain.model.valueobjects.AlertStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Repository for managing Alert entities.
 */
@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {
    List<Alert> findByStatus(AlertStatus status);
}