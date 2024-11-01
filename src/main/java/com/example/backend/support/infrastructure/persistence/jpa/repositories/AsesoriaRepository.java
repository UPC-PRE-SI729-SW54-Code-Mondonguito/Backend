package com.example.backend.support.infrastructure.persistence.jpa.repositories;

import com.example.backend.support.domain.model.aggregates.Asesoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AsesoriaRepository extends JpaRepository<Asesoria, Long> {
    Optional<Asesoria> findById(Long id);
}
