package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Transaccion;
import com.example.backend.reservas.domain.model.queries.GetTransaccionByIdQuery;
import com.example.backend.reservas.domain.model.queries.GetTransaccionByReciboIdQuery;
import com.example.backend.reservas.domain.services.TransaccionQueryService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.TransaccionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransaccionQueryServiceImp implements TransaccionQueryService {

    private final TransaccionRepository transaccionRepository;

    public TransaccionQueryServiceImp(TransaccionRepository transaccionRepository) { this.transaccionRepository = transaccionRepository;}

    @Override
    public Optional<Transaccion> handle(GetTransaccionByIdQuery query){
        return this.transaccionRepository.findById(query.transaccionId());
    }

    @Override
    public Optional<Transaccion> handle(GetTransaccionByReciboIdQuery query){
        return this.transaccionRepository.findByReciboId(query.reciboId());
    }

}
