package com.example.dealsbazzar.Repositories;

import com.example.dealsbazzar.Models.Payment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String>{
    
}
