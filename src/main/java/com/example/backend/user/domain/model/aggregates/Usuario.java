package com.example.backend.user.domain.model.aggregates;

import com.example.backend.user.domain.model.valueobjects.UsuarioPersonalInfo;
import com.example.backend.user.domain.model.valueobjects.UsuarioRol;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Profile;

@Entity
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "name",  column = @Column(name = "usuario_nombre")),
            @AttributeOverride(name = "age",  column = @Column(name = "usuario_age")),
            @AttributeOverride(name = "dni",  column = @Column(name = "usuario_dni")),
    })
    private UsuarioPersonalInfo personalInfo;

    @Embedded
    UsuarioRol rol;
    public Usuario() {

    }

    public Usuario(String fullname, String age, String dni, String rol) {
        this.personalInfo = new UsuarioPersonalInfo(fullname, age, dni);
        this.rol = new UsuarioRol(rol);
    }



    /*
    public Usuario(CreateUsuarioCommand command){
        this.personalInfo = new UsuarioPersonalInfo(command.fullname, command.age, command.dni);
        this.rol = new UsuarioRol(command.rol)
    }
    */

    public String getFullInfo(){
        return personalInfo.getFullInfo();
    }



}