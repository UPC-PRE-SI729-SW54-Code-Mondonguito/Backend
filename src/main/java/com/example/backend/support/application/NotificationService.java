package com.example.backend.support.application;

import com.example.backend.support.domain.model.aggregates.Notification;
import com.example.backend.support.domain.model.commands.CreateNotificationCommand;
import com.example.backend.support.domain.model.commands.DeleteNotificationCommand;
import com.example.backend.support.domain.model.commands.UpdateNotificationCommand;
import com.example.backend.support.domain.services.NotificationCommandService;
import com.example.backend.support.infrastructure.persistence.jpa.repositories.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService implements NotificationCommandService {
    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
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
        return Optional.empty();
    }

    @Override
    public void handle(DeleteNotificationCommand command) {

    }
}
