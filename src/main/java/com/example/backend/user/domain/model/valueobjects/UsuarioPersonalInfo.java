package com.example.backend.user.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record UsuarioPersonalInfo(String fullname, String age, String dni) {
    public UsuarioPersonalInfo() {this(null,null, null);}

    public UsuarioPersonalInfo{
        if (fullname == null || dni == null || fullname.isBlank() || dni.isBlank()) {
            throw new IllegalArgumentException("Fullname and dni cannot be empty");
        }
    }

    public String getFullInfo() {
        return String.format("%s %s %s", fullname, age, dni);
    }

}
