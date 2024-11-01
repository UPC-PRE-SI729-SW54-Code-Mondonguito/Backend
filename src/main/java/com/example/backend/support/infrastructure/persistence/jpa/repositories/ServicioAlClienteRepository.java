package com.example.backend.support.infrastructure.persistence.jpa.repositories;

import com.example.backend.support.domain.model.aggregates.ServicioAlCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServicioAlClienteRepository extends JpaRepository<ServicioAlCliente, Long> {
    Optional<ServicioAlCliente> findById(Long id);
}
