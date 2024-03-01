package com.example.conceptandcoding.controllers;


import com.example.conceptandcoding.dto.PaymentRequest;
import com.example.conceptandcoding.dto.PaymentResponse;
import com.example.conceptandcoding.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPayment(@PathVariable int id) {

        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setId(id);
        PaymentResponse paymentResponse=paymentService.getPaymentDetailById(id); // calls the service layer for response and returns

        return ResponseEntity.ok(paymentResponse);
    }

}
