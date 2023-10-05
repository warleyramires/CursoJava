package application;

import entities.enuns.OrderStatus;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        Order order = new Order(2, new Date(), OrderStatus.PENDING_PAYAMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

    }
}