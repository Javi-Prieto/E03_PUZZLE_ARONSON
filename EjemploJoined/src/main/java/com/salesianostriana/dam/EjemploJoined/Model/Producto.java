package com.salesianostriana.dam.EjemploJoined.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Inheritance(strategy= InheritanceType.JOINED)//Esta anotación es la que especifica qu la herencia es tipo Joined y siempre hay que ponersela al padre
public class Producto {

    @GeneratedValue
    @Id
    private Long id;

    private String nombre, categoria;
    private double precio;
    private int descuento;
}
