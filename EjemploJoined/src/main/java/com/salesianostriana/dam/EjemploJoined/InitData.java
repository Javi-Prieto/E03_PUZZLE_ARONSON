package com.salesianostriana.dam.EjemploJoined;

import com.salesianostriana.dam.EjemploJoined.Model.Producto;
import com.salesianostriana.dam.EjemploJoined.Model.ProductoPremium;
import com.salesianostriana.dam.EjemploJoined.Repositorios.ProductoPremiumRepo;
import com.salesianostriana.dam.EjemploJoined.Repositorios.ProductoRepo;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitData {

    private final ProductoPremiumRepo repositorioProductoPre;
    private final ProductoRepo repositorioProducto;

    @PostConstruct
    public void initData(){
        Producto p1= Producto.builder()
                .nombre("Pan con mermelada")
                .categoria("Perder")
                .precio(3)
                .descuento(12)
                .build();
        Producto p2= Producto.builder()
                .nombre("Café")
                .categoria("Perder")
                .precio(0.40)
                .descuento(0)
                .build();
        repositorioProducto.saveAll(List.of(p1,p2));
        ProductoPremium pP1= new ProductoPremium();
                pP1.setNombre("Burpees");
                pP1.setCategoria("Visa sana");
                pP1.setPrecio(12345);
                pP1.setDescuento(0);
                pP1.setPremium(true);
                pP1.setEstrellitas(5);

        ProductoPremium pP2= new ProductoPremium();
            pP2.setNombre("Burpees");
            pP2.setCategoria("Visa sana");
            pP2.setPrecio(12345);
            pP2.setDescuento(0);
            pP2.setPremium(true);
            pP2.setEstrellitas(5);
        repositorioProductoPre.saveAll(List.of(pP1, pP2));
    }
}
