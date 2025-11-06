package com.javatechie.controller;

public class OrderUpdate {

    private String orderId;
    private String userId;  // <-- ADD THIS
    private String status;
    private String time;

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {           // <-- ADD
        return userId;
    }
    public void setUserId(String userId) { // <-- ADD
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
