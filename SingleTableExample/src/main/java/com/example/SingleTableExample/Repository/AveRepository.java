package com.example.SingleTableExample.Repository;

import com.example.SingleTableExample.models.Ave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AveRepository extends BaseAnimalRepository<Ave> {
}