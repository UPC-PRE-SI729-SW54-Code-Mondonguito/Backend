package com.example.backend.user.infrastructure.persistence.jpa.repositories;

import com.example.backend.user.domain.model.aggregates.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    Optional<Usuario> findByDni(String personalInfo);
}