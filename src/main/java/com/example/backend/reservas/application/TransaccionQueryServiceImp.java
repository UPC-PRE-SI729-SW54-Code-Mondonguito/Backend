package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Transaccion;
import com.example.backend.reservas.domain.model.queries.GetTransaccionByIdQuery;
import com.example.backend.reservas.domain.model.queries.GetTransaccionByReciboIdQuery;
import com.example.backend.reservas.domain.services.TransaccionQueryService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.TransaccionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service implementation for handling queries related to Transacciones.
 */
@Service
public class TransaccionQueryServiceImp implements TransaccionQueryService {

    private final TransaccionRepository transaccionRepository;

    /**
     * Constructs a new TransaccionQueryServiceImp with the specified TransaccionRepository.
     *
     * @param transaccionRepository the repository to be used for accessing Transaccion data
     */
    public TransaccionQueryServiceImp(TransaccionRepository transaccionRepository) { this.transaccionRepository = transaccionRepository;}
   
    /**
     * Handles the GetTransaccionByIdQuery to retrieve a Transaccion by its ID.
     *
     * @param query the query containing the ID of the Transaccion to be retrieved
     * @return an Optional containing the Transaccion if found, or an empty Optional if not found
     */
    @Override
    public Optional<Transaccion> handle(GetTransaccionByIdQuery query){
        return this.transaccionRepository.findById(query.transaccionId());
    }

     /**
     * Handles the GetTransaccionByReciboIdQuery to retrieve a Transaccion by its Recibo ID.
     *
     * @param query the query containing the Recibo ID of the Transaccion to be retrieved
     * @return an Optional containing the Transaccion if found, or an empty Optional if not found
     */
    @Override
    public Optional<Transaccion> handle(GetTransaccionByReciboIdQuery query){
        return this.transaccionRepository.findByReciboId(query.reciboId());
    }

}
