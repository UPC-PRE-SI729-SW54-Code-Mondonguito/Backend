package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Recibo;
import com.example.backend.reservas.domain.model.queries.GetReciboByIdQuery;
import com.example.backend.reservas.domain.services.ReciboQueryService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.ReciboRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ReciboQueryServiceImp implements ReciboQueryService {
    private final ReciboRepository reciboRepository;
    public ReciboQueryServiceImp(ReciboRepository reciboRepository) { this.reciboRepository = reciboRepository; }

    @Override
    public Optional<Recibo> handle(GetReciboByIdQuery query){
        return this.reciboRepository.findById(query.reciboId());
    }

}
