package com.khai;

public class OrderProcessor {
    private NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {
        // Логика обработки заказа
        System.out.println("Order processed: " + order.getId());
        notificationService.notify(order);
    }
}
