package com.javatechie.controller;

public class OrderUpdate {
    private String orderId;
    private String userId;
    private String status;
    private String time;
    private String reason; // Optional, for rejected orders

    public OrderUpdate() {}

    public OrderUpdate(String orderId, String userId, String status, String time) {
        this.orderId = orderId;
        this.userId = userId;
        this.status = status;
        this.time = time;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    @Override
    public String toString() {
        return "OrderUpdate{" +
                "orderId='" + orderId + '\'' +
                ", userId='" + userId + '\'' +
                ", status='" + status + '\'' +
                ", time='" + time + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
