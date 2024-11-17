package com.example.backend.notification.domain.services;

import com.example.backend.notification.domain.model.aggregates.Notification;
import com.example.backend.notification.domain.model.commands.CreateNotificationCommand;
import com.example.backend.notification.domain.model.commands.UpdateNotificationCommand;

import java.util.Optional;

public interface NotificationCommandService {
    Optional<Notification> handle(CreateNotificationCommand command);
    Optional<Notification> handle(UpdateNotificationCommand command);
}
