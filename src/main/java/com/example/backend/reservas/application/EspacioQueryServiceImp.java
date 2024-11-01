package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Espacio;
import com.example.backend.reservas.domain.model.queries.GetEspacioByIdQuery;
import com.example.backend.reservas.domain.model.queries.GetEspacioByReservaIdQuery;
import com.example.backend.reservas.domain.services.EspacioQueryService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.EspacioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EspacioQueryServiceImp implements EspacioQueryService {
    private final EspacioRepository espacioRepository;
    public EspacioQueryServiceImp(EspacioRepository espacioRepository) { this.espacioRepository = espacioRepository; }

    @Override
    public Optional<Espacio> handle(GetEspacioByIdQuery query){
        return this.espacioRepository.findById(query.espacioId());
    }
    @Override
    public Optional<Espacio> handle(GetEspacioByReservaIdQuery query){
        return this.espacioRepository.findById(query.reservaId());
    }

}
