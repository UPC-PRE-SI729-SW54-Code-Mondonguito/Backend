package com.example.backend.reservas.infrastructure.persistence.jpa.repositories;

import com.example.backend.reservas.domain.model.aggregates.Recibo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReciboRepository extends JpaRepository<Recibo, Long> {
    Optional<Recibo> findById(Long id);
}
