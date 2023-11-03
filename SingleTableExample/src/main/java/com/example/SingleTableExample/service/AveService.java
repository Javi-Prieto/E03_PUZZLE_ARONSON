package com.example.SingleTableExample.service;

import com.example.SingleTableExample.Repository.AveRepository;
import com.example.SingleTableExample.models.Ave;
import com.example.SingleTableExample.service.base.BaseAnimalService;
import org.springframework.stereotype.Service;

@Service
public class AveService extends BaseAnimalService<Ave, AveRepository> {
}
