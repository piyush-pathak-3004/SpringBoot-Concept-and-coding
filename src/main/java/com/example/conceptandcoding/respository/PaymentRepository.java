package com.example.conceptandcoding.respository;

import com.example.conceptandcoding.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {
    public PaymentEntity getPaymentById(int id) {
        return executeQuery(id);
    }

    private PaymentEntity executeQuery(int id) {
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setId(id);
        paymentEntity.setName("piyush");
        paymentEntity.setPaymentMethods("cards");

        return  paymentEntity;
    }
}
