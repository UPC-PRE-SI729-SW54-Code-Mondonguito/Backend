package com.example.backend.user.domain.model.commands;

public record CreateUsuarioCommand(String fullname, String age, String dni, String rol) {
}
