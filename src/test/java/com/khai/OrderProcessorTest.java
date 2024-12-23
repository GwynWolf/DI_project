package com.khai;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessorTest {

    @Test
    void testProcessOrder_SendsNotification() {
        // Тест перевіряє, чи виконується обробка замовлення через OrderProcessor і чи надсилається повідомлення через NotificationService.
        NotificationService notificationService = new NotificationService();
        OrderProcessor orderProcessor = new OrderProcessor(notificationService);
        Order order = new Order(101, "Laptop Purchase");

        orderProcessor.processOrder(order);

        // Verify that the order was processed and notification was sent
        assertEquals(101, order.getId());
        assertEquals("Laptop Purchase", order.getDescription());
    }


    @Test
    void testNotify_SendsNotificationForOrder() {
        // Тест перевіряє, чи NotificationService правильно надсилає повідомлення для переданого замовлення.
        NotificationService notificationService = new NotificationService();
        Order order = new Order(202, "Smartphone Purchase");
        notificationService.notify(order);

        assertEquals(202, order.getId());
        assertEquals("Smartphone Purchase", order.getDescription());
    }

    @Test
    void testOrderGetId_ReturnsCorrectId() {
        // Тест перевіряє, чи метод getId класу Order повертає коректний ідентифікатор замовлення.
        Order order = new Order(303, "Tablet Purchase");
        assertEquals(303, order.getId());
    }

    @Test
    void testOrderGetDescription_ReturnsCorrectDescription() {
        // Тест перевіряє, чи метод getDescription класу Order повертає коректний опис замовлення.
        Order order = new Order(404, "Gaming Console Purchase");
        assertEquals("Gaming Console Purchase", order.getDescription());
    }

    @Test
    void testOrderProcessor_WithMultipleOrders() {
        // Тест перевіряє, чи OrderProcessor може обробляти декілька замовлень
        NotificationService notificationService = new NotificationService();
        OrderProcessor orderProcessor = new OrderProcessor(notificationService);

        Order order1 = new Order(505, "Desktop Computer Purchase");
        Order order2 = new Order(606, "Smartwatch Purchase");

        orderProcessor.processOrder(order1);
        orderProcessor.processOrder(order2);

        assertEquals(505, order1.getId());
        assertEquals("Desktop Computer Purchase", order1.getDescription());
        assertEquals(606, order2.getId());
        assertEquals("Smartwatch Purchase", order2.getDescription());
    }
}
