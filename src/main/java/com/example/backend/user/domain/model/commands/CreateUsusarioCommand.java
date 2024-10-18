package com.example.backend.user.domain.model.commands;

public record CreateUsusarioCommand(String fullname, String age, String dni, String rol) {
}
