package com.example.conceptandcoding.Entity;

public class PaymentEntity {
    private int id;
    private String name;
    private String ammounts;
    private String currency;
    private String paymentMethods;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAmmounts() {
        return ammounts;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPaymentMethods() {
        return paymentMethods;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmmounts(String ammounts) {
        this.ammounts = ammounts;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setPaymentMethods(String paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}
