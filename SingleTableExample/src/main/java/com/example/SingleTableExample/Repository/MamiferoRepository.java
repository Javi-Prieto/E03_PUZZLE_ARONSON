package com.example.SingleTableExample.Repository;

import com.example.SingleTableExample.models.Mamifero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MamiferoRepository extends BaseAnimalRepository<Mamifero> {
}