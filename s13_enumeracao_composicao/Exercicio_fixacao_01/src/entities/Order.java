package entities;

import enums.OrderStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(){

    }
    public  Order(Date moment, Client client, OrderStatus status){
        this.client = client;
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }
    public void removeItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public Double total(){
        double sum = 0;
        for(OrderItem i : orderItems){
            sum += i.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(moment).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client.getName()).append(" (")
                .append(client.getBirthDate()).append(") - ")
                .append(client.getEmail()).append("\n");
        sb.append("Order items:\n");
        for (OrderItem item : orderItems) {
            sb.append(item.getProduct().getName()).append(", ")
                    .append("$").append(item.getProduct().getPrice()).append(", ")
                    .append("Quantity: ").append(item.getQuantity()).append(", ")
                    .append("Subtotal: $").append(item.subTotal()).append("\n");
        }
        sb.append("Total price: $").append(total());
        return sb.toString();
    }

}
