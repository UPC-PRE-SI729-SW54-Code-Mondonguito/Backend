package com.example.backend.notification.domain.model.aggregates;

import com.example.backend.notification.domain.model.commands.CreateAlertCommand;
import com.example.backend.notification.domain.model.valueobjects.AlertStatus;
import jakarta.persistence.*;
import lombok.Getter;

/**
 * Represents an alert entity with its status and activity state.
 */
@Getter
@Entity
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isActive;

    @Enumerated(EnumType.STRING)
    private AlertStatus status;

    /**
     * Default constructor for JPA.
     */
    public Alert() {}

    /**
     * Constructs an Alert with specific activity state and status.
     *
     * @param isActive The active state of the alert.
     * @param status   The status of the alert.
     */
    public Alert(boolean isActive, AlertStatus status) {
        this.isActive = isActive;
        this.status = status;
    }

    /**
     * Constructs an Alert using the CreateAlertCommand.
     *
     * @param command Command containing alert data.
     */
    public Alert(CreateAlertCommand command) {
        this.isActive = command.isActive();
        this.status = command.status();
    }
    public void updateStatus(AlertStatus status) {
        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        this.status = status;
    }
}
