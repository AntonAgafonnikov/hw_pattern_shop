package ru.netology.website.database.orders;

public class Order {
    private Object product;
    private int amount;

    public Order(Object product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Object getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}
