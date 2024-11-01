package com.example.backend.reservas.infrastructure.persistence.jpa.repositories;

import com.example.backend.reservas.domain.model.aggregates.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
    Optional<Transaccion> findById(Long id);
    Optional<Transaccion> findByReciboId(Long id);
}
