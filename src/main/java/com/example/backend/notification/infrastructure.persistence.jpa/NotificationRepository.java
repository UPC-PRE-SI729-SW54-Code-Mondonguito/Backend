package com.example.backend.notification.infrastructure.persistence.jpa;

import com.example.backend.notification.domain.model.aggregates.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing Notification entities.
 */
import java.util.List;

/**
 * Repository for managing Notification entities.
 */
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByUserId(Long userId);
}