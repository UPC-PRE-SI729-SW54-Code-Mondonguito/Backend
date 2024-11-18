package com.example.backend.local.infrastructure.persistance.jpa.repositories;

import com.example.backend.local.domain.model.aggregates.Local;
import com.example.backend.local.domain.model.aggregates.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {
    Optional<Local> findById(Local id);
    Optional<Local> findByNombre(String nombre);

    Optional<Local> findByUbicacion(String Ubicacion);

}
