package com.example.backend.local.infrastructure.persistance.jpa.repositories;

import com.example.backend.local.domain.model.aggregates.Opinion;
import com.example.backend.notification.domain.model.aggregates.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OpinionRepository extends JpaRepository<Opinion, Long> {
    Optional<Opinion> findByTitle(String title);
    Optional<Opinion> findById(Long id);

}
