package com.example.dealsbazzar.Repositories;

import com.example.dealsbazzar.Models.PaymentType;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentTypeRepository extends MongoRepository<PaymentType, String>{
    
}
