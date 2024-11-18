package com.example.backend.local.domain.services;

import com.example.backend.local.domain.model.aggregates.Opinion;
import com.example.backend.local.domain.model.queries.GetOpinionByIdQuery;

import java.util.Optional;

public interface OpinionQueryService {
    Optional<Opinion> handle(GetOpinionByIdQuery query);
}
