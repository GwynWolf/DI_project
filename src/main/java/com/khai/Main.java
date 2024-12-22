package com.khai;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, "test order");
        NotificationService notificationService = new NotificationService();
        System.out.println(order.getDescription());
        OrderProcessor orderProcessor = new OrderProcessor(notificationService);
        orderProcessor.processOrder(order);
    }
}