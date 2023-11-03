package com.example.SingleTableExample.service;

import com.example.SingleTableExample.Repository.MamiferoRepository;
import com.example.SingleTableExample.models.Mamifero;
import com.example.SingleTableExample.service.base.BaseAnimalService;
import org.springframework.stereotype.Service;

@Service
public class MamiferoService extends BaseAnimalService<Mamifero, MamiferoRepository> {
}
