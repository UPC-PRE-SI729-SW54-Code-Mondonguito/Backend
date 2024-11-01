package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Reservas;
import com.example.backend.reservas.domain.model.queries.GetReservaByIdQuery;
import com.example.backend.reservas.domain.model.queries.GetReservaByTransaccionIdQuery;
import com.example.backend.reservas.domain.services.ReservasQueryService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.ReservasRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service implementation for handling queries related to Reservas.
 */
@Service
public class ReservaQueryServiceImp implements ReservasQueryService {
    private final ReservasRepository reservasRepository;

    /**
     * Constructs a new ReservaQueryServiceImp with the specified ReservasRepository.
     *
     * @param reservasRepository the repository to be used for accessing Reservas data
     */
    public ReservaQueryServiceImp(ReservasRepository reservasRepository) { this.reservasRepository = reservasRepository;}

    /**
     * Handles the GetReservaByIdQuery to retrieve a Reserva by its ID.
     *
     * @param query the query containing the ID of the Reserva to be retrieved
     * @return an Optional containing the Reserva if found, or an empty Optional if not found
     */
    @Override
    public Optional<Reservas> handle(GetReservaByIdQuery query){
        return this.reservasRepository.findById(query.reservaId());
    }
    
    /**
     * Handles the GetReservaByTransaccionIdQuery to retrieve a Reserva by its transaction ID.
     *
     * @param query the query containing the transaction ID of the Reserva to be retrieved
     * @return an Optional containing the Reserva if found, or an empty Optional if not found
     */
    @Override
    public Optional<Reservas> handle(GetReservaByTransaccionIdQuery query){
        return this.reservasRepository.findByTransaccionId(query.transaccionId());
    }

}
