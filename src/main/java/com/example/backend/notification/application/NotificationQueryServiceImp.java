package com.example.backend.notification.application;

import com.example.backend.notification.domain.model.aggregates.Notification;
import com.example.backend.notification.domain.model.queries.GetNotificationByIdQuery;
import com.example.backend.notification.domain.model.queries.GetNotificationsByUserQuery;
import com.example.backend.notification.domain.services.NotificationQueryService;
import com.example.backend.notification.infrastructure.persistence.jpa.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for handling queries related to Notifications.
 */
@Service
public class NotificationQueryServiceImp implements NotificationQueryService {

    private final NotificationRepository notificationRepository;

    public NotificationQueryServiceImp(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Optional<Notification> handle(GetNotificationByIdQuery query) {
        return notificationRepository.findById(query.id());
    }

    @Override
    public List<Notification> handle(GetNotificationsByUserQuery query) {
        return notificationRepository.findByUserId(query.userId());
    }
}
