package com.example.SingleTableExample.service.base;

import com.example.SingleTableExample.Repository.BaseAnimalRepository;
import com.example.SingleTableExample.models.Animal;

public class BaseAnimalService<T extends Animal, R extends BaseAnimalRepository<T>> extends BaseService<T, Long, R> {
}
