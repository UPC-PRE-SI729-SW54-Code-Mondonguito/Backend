package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Recibo;
import com.example.backend.reservas.domain.model.queries.GetReciboByIdQuery;
import com.example.backend.reservas.domain.services.ReciboQueryService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.ReciboRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
/**
 * Service implementation for handling queries related to Recibo.
 */
@Service
public class ReciboQueryServiceImp implements ReciboQueryService {
    private final ReciboRepository reciboRepository;
    /**
     * Constructs a new ReciboQueryServiceImp with the specified ReciboRepository.
     *
     * @param reciboRepository the repository to be used for accessing Recibo data
     */
    public ReciboQueryServiceImp(ReciboRepository reciboRepository) { this.reciboRepository = reciboRepository; }
    
    /**
     * Handles the GetReciboByIdQuery to retrieve a Recibo by its ID.
     *
     * @param query the query containing the ID of the Recibo to be retrieved
     * @return an Optional containing the Recibo if found, or an empty Optional if not found
     */
    @Override
    public Optional<Recibo> handle(GetReciboByIdQuery query){
        return this.reciboRepository.findById(query.reciboId());
    }

}
