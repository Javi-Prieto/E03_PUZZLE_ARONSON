package com.salesianostriana.dam.EjemploJoined.Repositorios;

import com.salesianostriana.dam.EjemploJoined.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto, Long> {
}
