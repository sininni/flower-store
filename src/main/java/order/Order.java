package order;

import delivery.Delivery;
import item.Item;
import payment.Payment;
import sun.awt.util.IdentityLinkedList;

import java.util.LinkedList;

public class Order {
    private IdentityLinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.payment = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : this.items) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void processOrder(){}

    public void addItem (Item item) {
        this.items.add(item);
    }

    public void removeItem (Item item) {
        this.items.remove(item);
    }
}
