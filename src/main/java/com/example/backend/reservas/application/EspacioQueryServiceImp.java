package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Espacio;
import com.example.backend.reservas.domain.model.queries.GetEspacioByIdQuery;
import com.example.backend.reservas.domain.model.queries.GetEspacioByReservaIdQuery;
import com.example.backend.reservas.domain.services.EspacioQueryService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.EspacioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

// This service implementation handles queries related to the Espacio entity.
@Service
public class EspacioQueryServiceImp implements EspacioQueryService {
    private final EspacioRepository espacioRepository;

    // Constructor injection of the EspacioRepository.
    public EspacioQueryServiceImp(EspacioRepository espacioRepository) { 
        this.espacioRepository = espacioRepository; 
    }

    // Handles the query to retrieve an Espacio by its ID.
    @Override
    public Optional<Espacio> handle(GetEspacioByIdQuery query){
        return this.espacioRepository.findById(query.espacioId());
    }

    // Handles the query to retrieve an Espacio by its associated Reserva ID.
    @Override
    public Optional<Espacio> handle(GetEspacioByReservaIdQuery query){
        return this.espacioRepository.findById(query.reservaId());
    }
}
