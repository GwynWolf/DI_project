package com.khai;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, "test order");
        System.out.println(order.getDescription());
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(order);
    }
}