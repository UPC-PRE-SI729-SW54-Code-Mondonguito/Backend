package com.example.backend.user.domain.model.aggregates;


import com.example.backend.user.domain.model.valueobjects.DuenoRUC;
import com.example.backend.user.domain.model.valueobjects.Duenoinfo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Dueno_de_playas extends Usuario {

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "phone number", column = @Column(name = "phone_number")),
            @AttributeOverride(name = "Email", column = @Column(name = "email")),
    })
    private Duenoinfo dueno_info;


    @Embedded
    DuenoRUC dueno_RUC;

    public Dueno_de_playas() {
    }
    public Dueno_de_playas(String RUC, String phone_number, String email) {
        this.dueno_info = new Duenoinfo(phone_number, email);
        this.dueno_RUC = new DuenoRUC(RUC);
    }


}
