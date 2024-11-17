package com.example.backend.notification.domain.services;

import com.example.backend.notification.domain.model.aggregates.Notification;
import com.example.backend.notification.domain.model.queries.GetNotificationByIdQuery;
import com.example.backend.notification.domain.model.queries.GetNotificationsByUserQuery;

import java.util.List;
import java.util.Optional;

public interface NotificationQueryService {
    Optional<Notification> handle(GetNotificationByIdQuery query);
    List<Notification> handle(GetNotificationsByUserQuery query);
}
