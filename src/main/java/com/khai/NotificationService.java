package com.khai;

public class NotificationService {
    public void notify(Order order) {
        // Имитация отправки уведомления
        System.out.println("Notification sent for Order ID: " + order.getId());
    }
}
