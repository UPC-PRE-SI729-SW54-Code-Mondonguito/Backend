package com.example.backend.notification.application;

import com.example.backend.notification.domain.model.aggregates.Notification;
import com.example.backend.notification.domain.model.commands.CreateNotificationCommand;
import com.example.backend.notification.domain.model.commands.UpdateNotificationCommand;
import com.example.backend.notification.domain.services.NotificationCommandService;
import com.example.backend.notification.infrastructure.persistence.jpa.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service implementation for handling commands related to Notifications.
 */
@Service
public class NotificationCommandServiceImp implements NotificationCommandService {

    private final NotificationRepository notificationRepository;

    public NotificationCommandServiceImp(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Optional<Notification> handle(CreateNotificationCommand command) {
        var notification = new Notification(command);
        notificationRepository.save(notification);
        return Optional.of(notification);
    }

    @Override
    public Optional<Notification> handle(UpdateNotificationCommand command) {
        return notificationRepository.findById(command.id())
                .map(notification -> {
                    notification.updateDetails(command.details());
                    notification.updateTimestamp(command.timestamp());
                    notificationRepository.save(notification);
                    return notification;
                });
    }
}
