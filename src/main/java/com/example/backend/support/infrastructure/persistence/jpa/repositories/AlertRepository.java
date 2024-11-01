package com.example.backend.support.infrastructure.persistence.jpa.repositories;

import com.example.backend.support.domain.model.aggregates.Alerts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlertRepository extends JpaRepository<Alerts, Long> {
    Optional<Alerts> findById(Long id);
}
