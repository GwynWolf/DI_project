package com.khai;

public class OrderProcessor {
    private NotificationService notificationService;

    public OrderProcessor() {
        this.notificationService = new NotificationService();
    }

    public void processOrder(Order order) {
        // Логика обработки заказа
        System.out.println("Order processed: " + order.getId());
        notificationService.notify(order);
    }
}
