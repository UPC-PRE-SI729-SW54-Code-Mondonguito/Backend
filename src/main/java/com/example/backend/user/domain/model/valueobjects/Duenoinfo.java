package com.example.backend.user.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record Duenoinfo(String phone_number, String email) {
    public Duenoinfo() {this(null, null);}

    public Duenoinfo {
        if (phone_number == null || phone_number.isEmpty()) {
            throw new IllegalArgumentException("Phone number is required");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email is required");
        }
    }
}
