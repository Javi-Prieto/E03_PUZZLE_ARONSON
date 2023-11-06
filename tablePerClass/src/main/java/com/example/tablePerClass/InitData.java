package com.example.tablePerClass;

import com.example.tablePerClass.model.Client;
import com.example.tablePerClass.model.VipClient;
import com.example.tablePerClass.service.ClientService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {

    private final ClientService clientService;

    @PostConstruct
    public void onInit(){

        VipClient v = new VipClient(1L, "Alejandro", "Jimenez", 19, "alejandrojimenez@gmial.com", "1625367P");
        clientService.save(v);



        System.out.println(clientService.getClientById(1L).getNombre());


    }
}
