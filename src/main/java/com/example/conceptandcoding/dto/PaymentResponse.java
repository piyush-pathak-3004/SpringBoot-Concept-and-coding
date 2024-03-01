package com.example.conceptandcoding.dto;

import org.springframework.stereotype.Controller;

@Controller
public class PaymentResponse {
    private int id;
    private String name;
    private  String paymentMethod;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }

}
