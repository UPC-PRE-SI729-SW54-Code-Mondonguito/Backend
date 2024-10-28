package com.example.backend.user.domain.services;


import com.example.backend.user.domain.model.aggregates.Dueno_de_playas;
import com.example.backend.user.domain.model.queries.GetDuenoDePlayasByRUC;

import java.util.Optional;

public interface DuenoQueryService extends UsuarioQueryService{
    Optional<Dueno_de_playas> handle(GetDuenoDePlayasByRUC query);
}
