package com.example.tablePerClass.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class VipClient extends Client {

    private String dni;

    public VipClient (Long id, String nombre, String apellido, Integer edad, String email, String dni){
        super(id, nombre, apellido, edad, email);
        this.dni = dni;
    }

}
