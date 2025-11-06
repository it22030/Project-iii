package com.javatechie.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class OrderNotificationController {

    private final SimpMessagingTemplate messagingTemplate;

    public OrderNotificationController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/order/status")
    public void sendOrderStatus(OrderUpdate orderUpdate) {

        // সময় সেট করা
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        orderUpdate.setTime(time);

        // ✅ Broadcast notification to user
        messagingTemplate.convertAndSend("/topic/order", orderUpdate);

        // ❌ Remove auto status update logic
        // এখন থেকে Prepared / Ready / Delivered শুধুমাত্র admin manual click দ্বারা পাঠানো হবে
    }
}
