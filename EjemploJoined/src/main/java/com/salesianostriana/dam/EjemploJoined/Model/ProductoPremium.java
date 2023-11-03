package com.salesianostriana.dam.EjemploJoined.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@PrimaryKeyJoinColumn(name= "producto_id")
public class ProductoPremium extends Producto{


    private boolean premium;

    private int estrellitas;

    public ProductoPremium(Long id, String nombre, String categoria, double precio, int descuento, boolean premium, int estrellitas) {
        super(id, nombre, categoria, precio, descuento);
        this.premium = premium;
        this.estrellitas = estrellitas;
    }
}
