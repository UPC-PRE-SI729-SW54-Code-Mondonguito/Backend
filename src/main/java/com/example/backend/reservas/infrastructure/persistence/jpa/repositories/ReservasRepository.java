package com.example.backend.reservas.infrastructure.persistence.jpa.repositories;

import com.example.backend.reservas.domain.model.aggregates.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservasRepository extends JpaRepository<Reservas, Long> {
    Optional<Reservas> findById(Long id);
    Optional<Reservas> findByTransaccionId(Long transaccionId);
}
