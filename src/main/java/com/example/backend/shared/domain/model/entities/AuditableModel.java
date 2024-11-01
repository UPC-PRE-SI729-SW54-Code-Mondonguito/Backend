package com.example.backend.shared.domain.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.example.backend.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;

/**
 * Example of an auditable model entity.
 */
@Entity
public class AuditableModel extends AuditableAbstractAggregateRoot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Additional fields can go here
}
