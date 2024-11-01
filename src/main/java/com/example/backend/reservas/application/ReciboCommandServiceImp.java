package com.example.backend.reservas.application;

import com.example.backend.reservas.domain.model.aggregates.Espacio;
import com.example.backend.reservas.domain.model.aggregates.Recibo;
import com.example.backend.reservas.domain.model.commands.CreateReciboCommand;
import com.example.backend.reservas.domain.services.ReciboCommandService;
import com.example.backend.reservas.infrastructure.persistence.jpa.repositories.ReciboRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ReciboCommandServiceImp implements ReciboCommandService {
    private final ReciboRepository reciboRepository;
    public ReciboCommandServiceImp(ReciboRepository reciboRepository) {this.reciboRepository = reciboRepository;}

    @Override
    public Optional<Recibo> handle(CreateReciboCommand command) {
        var recibo = new Recibo(command);
        reciboRepository.findById(command.transaccion().getId()).map(reciboId -> {
            throw new IllegalArgumentException("Profile with email "+ reciboId.getTransaccion().getId() + " already exists");
        });
        var Newrecibo = new Recibo(command);
        reciboRepository.save(Newrecibo);
        return Optional.of(Newrecibo);
    }
}
