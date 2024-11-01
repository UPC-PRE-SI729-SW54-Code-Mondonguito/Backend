package com.example.backend.reservas.domain.model.valueobjects;

import java.util.Date;

public record DatosTransaccion(Double monto, Date fecha, String metodo_pago) {
    public DatosTransaccion() {this(null,null,null);}

    public DatosTransaccion {
        if (monto == null || monto == 0){
            throw new IllegalArgumentException("monto can't be null or empty");
        }
        if(fecha == null ){
            throw new IllegalArgumentException("fecha can't be null or empty");
        }
        if (metodo_pago == null || metodo_pago.isBlank()){
            throw new IllegalArgumentException("metodo_pago can't be null or empty");
        }
    }

}
