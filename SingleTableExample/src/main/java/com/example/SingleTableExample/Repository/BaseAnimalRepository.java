package com.example.SingleTableExample.Repository;

import com.example.SingleTableExample.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseAnimalRepository<T extends Animal> extends JpaRepository<T, Long> {
}