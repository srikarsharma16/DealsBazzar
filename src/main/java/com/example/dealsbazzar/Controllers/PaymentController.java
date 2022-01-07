package com.example.dealsbazzar.Controllers;

import com.example.dealsbazzar.Models.Payment;
import com.example.dealsbazzar.Services.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dealbazzar")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment")
    public ResponseEntity savePayment(@RequestBody Payment payment)
    {
        Payment newPayment= paymentService.savePayment(payment);
        if(newPayment==null)
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        else
            return ResponseEntity.ok(newPayment);
    }
}
