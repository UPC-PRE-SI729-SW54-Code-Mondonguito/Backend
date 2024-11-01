package com.example.backend.support.application;

import com.example.backend.support.domain.model.aggregates.ServicioAlCliente;
import com.example.backend.support.domain.model.commands.CreateServicioAlClienteCommand;
import com.example.backend.support.domain.model.commands.DeleteServicioAlClienteCommand;
import com.example.backend.support.domain.model.commands.UpdateServicioAlClienteCommand;
import com.example.backend.support.domain.services.ServicioAlClienteCommandService;
import com.example.backend.support.infrastructure.persistence.jpa.repositories.ServicioAlClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicioAlClienteService implements ServicioAlClienteCommandService {
    private final ServicioAlClienteRepository servicioAlClienteRepository;

    public ServicioAlClienteService(ServicioAlClienteRepository servicioAlClienteRepository) {
        this.servicioAlClienteRepository = servicioAlClienteRepository;
    }

    @Override
    public Optional<ServicioAlCliente> handle(CreateServicioAlClienteCommand command) {
        var servicio = new ServicioAlCliente(command);
        servicioAlClienteRepository.save(servicio);
        return Optional.of(servicio);
    }

    @Override
    public Optional<ServicioAlCliente> handle(UpdateServicioAlClienteCommand command) {
        return Optional.empty();
    }

    @Override
    public void handle(DeleteServicioAlClienteCommand command) {

    }
}
