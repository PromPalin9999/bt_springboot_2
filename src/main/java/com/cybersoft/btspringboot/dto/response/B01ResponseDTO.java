package com.cybersoft.btspringboot.dto.response;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"orderId", "currency"})
public class B01ResponseDTO {
    private int orderId;
    private String currency;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
