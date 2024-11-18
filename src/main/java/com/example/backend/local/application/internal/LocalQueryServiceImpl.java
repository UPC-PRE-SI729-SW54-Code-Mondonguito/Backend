package com.example.backend.local.application.internal;

import com.example.backend.local.domain.model.aggregates.Local;
import com.example.backend.local.domain.model.queries.GetLocalByIdQuery;
import com.example.backend.local.domain.model.queries.GetLocalByNameIdQuery;
import com.example.backend.local.domain.model.queries.GetLocalByOpinionIdQuery;
import com.example.backend.local.domain.model.queries.GetLocalByUbicacionQuery;
import com.example.backend.local.domain.services.LocalQueryService;
import com.example.backend.local.infrastructure.persistance.jpa.repositories.LocalRepository;

import java.util.Optional;

public class LocalQueryServiceImpl implements LocalQueryService {
    private final LocalRepository localRepository;
    public LocalQueryServiceImpl(final LocalRepository localRepository) {this.localRepository = localRepository;}

    @Override
    public Optional<Local> handle(GetLocalByIdQuery query) {
        return Optional.empty();
    }

    @Override
    public Optional<Local> handle(GetLocalByOpinionIdQuery query) {
        return Optional.empty();
    }

    @Override
    public Optional<Local> handle(GetLocalByUbicacionQuery query) {
        return Optional.empty();
    }

    @Override
    public Optional<Local> handle(GetLocalByNameIdQuery query) {
        return Optional.empty();
    }
}
