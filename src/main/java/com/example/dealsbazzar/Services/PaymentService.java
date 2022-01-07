package com.example.dealsbazzar.Services;

import com.example.dealsbazzar.Models.Payment;
import com.example.dealsbazzar.Repositories.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    
    @Autowired
    PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment)
    {
        try{
            paymentRepository.insert(payment);
            return payment;
        }catch(Exception e){
            return null;
        }
    }
}
