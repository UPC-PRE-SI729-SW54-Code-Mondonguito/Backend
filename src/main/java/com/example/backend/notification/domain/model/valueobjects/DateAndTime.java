package com.example.backend.notification.domain.model.valueobjects;

import java.time.LocalDateTime;

/**
 * Value object representing the timestamp of a notification.
 */
public record DateAndTime(LocalDateTime timestamp) {

    public DateAndTime {
        if (timestamp == null) {
            throw new IllegalArgumentException("Timestamp cannot be null");
        }
    }
}
