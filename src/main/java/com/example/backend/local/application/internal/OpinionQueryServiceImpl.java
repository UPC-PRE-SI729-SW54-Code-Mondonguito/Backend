package com.example.backend.local.application.internal;

import com.example.backend.local.domain.model.aggregates.Opinion;
import com.example.backend.local.domain.model.queries.GetOpinionByIdQuery;
import com.example.backend.local.domain.services.OpinionQueryService;
import com.example.backend.local.infrastructure.persistance.jpa.repositories.LocalRepository;
import com.example.backend.local.infrastructure.persistance.jpa.repositories.OpinionRepository;

import java.util.Optional;

public class OpinionQueryServiceImpl implements OpinionQueryService {

    private final OpinionRepository OpinionRepository;
    public OpinionQueryServiceImpl(final OpinionRepository OpinionRepository) {this.OpinionRepository = OpinionRepository;}
    @Override
    public Optional<Opinion> handle(GetOpinionByIdQuery query) {
        return Optional.empty();
    }
}
