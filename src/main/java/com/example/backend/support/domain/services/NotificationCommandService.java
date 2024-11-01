package com.example.backend.support.domain.services;

import com.example.backend.support.domain.model.aggregates.Notification;
import com.example.backend.support.domain.model.commands.CreateNotificationCommand;
import com.example.backend.support.domain.model.commands.UpdateNotificationCommand;
import com.example.backend.support.domain.model.commands.DeleteNotificationCommand;

import java.util.Optional;

public interface NotificationCommandService {
    Optional<Notification> handle(CreateNotificationCommand command);
    Optional<Notification> handle(UpdateNotificationCommand command);
    void handle(DeleteNotificationCommand command);
}
