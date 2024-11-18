package com.example.backend.local.domain.services;

import com.example.backend.local.domain.model.aggregates.Local;
import com.example.backend.local.domain.model.queries.GetLocalByIdQuery;
import com.example.backend.local.domain.model.queries.GetLocalByNameIdQuery;
import com.example.backend.local.domain.model.queries.GetLocalByOpinionIdQuery;
import com.example.backend.local.domain.model.queries.GetLocalByUbicacionQuery;

import java.util.Optional;

public interface LocalQueryService {
    Optional<Local> handle(GetLocalByIdQuery query);
    Optional<Local> handle(GetLocalByOpinionIdQuery query);
    Optional<Local> handle(GetLocalByUbicacionQuery query);
    Optional<Local> handle(GetLocalByNameIdQuery query);
}
