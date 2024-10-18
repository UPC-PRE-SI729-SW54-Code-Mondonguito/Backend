package com.example.backend.user.infrastructure.persistence.jpa.repositories;

import com.example.backend.user.domain.model.aggregates.Usuario;
import com.example.backend.user.domain.model.valueobjects.UsuarioPersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByDni(UsuarioPersonalInfo personalInfo);
}