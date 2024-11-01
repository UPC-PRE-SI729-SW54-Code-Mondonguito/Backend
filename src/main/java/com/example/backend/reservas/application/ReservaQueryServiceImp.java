package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Reservas;
import com.example.backend.reservas.domain.model.queries.GetReservaByIdQuery;
import com.example.backend.reservas.domain.model.queries.GetReservaByTransaccionIdQuery;
import com.example.backend.reservas.domain.services.ReservasQueryService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.ReservasRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservaQueryServiceImp implements ReservasQueryService {
    private final ReservasRepository reservasRepository;

    public ReservaQueryServiceImp(ReservasRepository reservasRepository) { this.reservasRepository = reservasRepository;}

    @Override
    public Optional<Reservas> handle(GetReservaByIdQuery query){
        return this.reservasRepository.findById(query.reservaId());
    }
    @Override
    public Optional<Reservas> handle(GetReservaByTransaccionIdQuery query){
        return this.reservasRepository.findByTransaccionId(query.transaccionId());
    }

}
