package com.example.backend.local.domain.model.commands;

public record DeleteOpinionCommand(Long opinionId) {
    public DeleteOpinionCommand {
        if(opinionId == null || opinionId <= 0){
            throw new IllegalArgumentException("Invalid opinion id");
        }

    }
}
