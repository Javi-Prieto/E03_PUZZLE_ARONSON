package com.example.SingleTableExample;

import com.example.SingleTableExample.models.Ave;
import com.example.SingleTableExample.models.Mamifero;
import com.example.SingleTableExample.service.AveService;
import com.example.SingleTableExample.service.MamiferoService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {
    private  final MamiferoService serviceM;
    private final AveService serviceA;
    @PostConstruct
    public void init(){
        Mamifero m = Mamifero.builder()
                .poneHuevos(false)
                .nombre("Elefante")
                .build();
        serviceM.save(m);
        Ave a = Ave.builder()
                .nombre("Paloma")
                .poneHuevos(true)
                .build();
        serviceA.save(a);
    }
}
