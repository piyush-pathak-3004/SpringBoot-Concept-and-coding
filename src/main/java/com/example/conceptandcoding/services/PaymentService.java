package com.example.conceptandcoding.services;

import com.example.conceptandcoding.Entity.PaymentEntity;
import com.example.conceptandcoding.dto.PaymentResponse;
import com.example.conceptandcoding.respository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    public PaymentResponse getPaymentDetailById(int id) {
        PaymentEntity paymentEntity = paymentRepository.getPaymentById(id);

        return paymentEntityToResponse(paymentEntity);
    }

    private PaymentResponse paymentEntityToResponse(PaymentEntity paymentEntity) {
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setId(paymentEntity.getId());
        paymentResponse.setName(paymentEntity.getName());
        paymentResponse.setPaymentMethod(paymentEntity.getPaymentMethods());

        return paymentResponse;
    }
}
