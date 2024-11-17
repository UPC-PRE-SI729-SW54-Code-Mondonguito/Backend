package com.example.backend.notification.domain.model.aggregates;

import com.example.backend.notification.domain.model.commands.CreateNotificationCommand;
import com.example.backend.notification.domain.model.valueobjects.NotificationDetails;
import com.example.backend.notification.domain.model.valueobjects.DateAndTime;
import jakarta.persistence.*;
import lombok.Getter;

/**
 * Represents a notification entity with its details and timestamp.
 */
@Getter
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "description", column = @Column(name = "description")),
            @AttributeOverride(name = "userId", column = @Column(name = "user_id"))
    })
    private NotificationDetails details;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "timestamp", column = @Column(name = "timestamp"))
    })
    private DateAndTime timestamp;

    /**
     * Default constructor for JPA.
     */
    public Notification() {}

    /**
     * Constructs a Notification with specific details and timestamp.
     *
     * @param details    Details of the notification.
     * @param timestamp  Timestamp of the notification.
     */
    public Notification(NotificationDetails details, DateAndTime timestamp) {
        this.details = details;
        this.timestamp = timestamp;
    }

    /**
     * Constructs a Notification using the CreateNotificationCommand.
     *
     * @param command Command containing notification data.
     */
    public Notification(CreateNotificationCommand command) {
        this.details = command.details();
        this.timestamp = command.timestamp();
    }

    public void updateDetails(NotificationDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("Details cannot be null");
        }
        this.details = details;
    }

    public void updateTimestamp(DateAndTime timestamp) {
        if (timestamp == null) {
            throw new IllegalArgumentException("Timestamp cannot be null");
        }
        this.timestamp = timestamp;
    }

}
