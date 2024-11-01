package com.example.backend.reservas.infrastructure.persistence.jpa.repositories;

import com.example.backend.reservas.domain.model.aggregates.Espacio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EspacioRepository extends JpaRepository<Espacio, Long> {

    Optional<Espacio> findById(Long id);

    Optional<Espacio> findByReservaId(Long id);

}
