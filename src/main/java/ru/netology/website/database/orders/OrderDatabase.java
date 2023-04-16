package ru.netology.website.database.orders;

import java.util.ArrayList;
import java.util.List;

public class OrderDatabase {
    private List<Order> listOrder = new ArrayList();

    public void addOrder(Object product, int amount) {
        listOrder.add(new Order(product, amount));
    }

}
