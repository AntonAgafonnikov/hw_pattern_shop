package ru.netology.website.database.products;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    List<Object> listProducts = new ArrayList<>();

    public List<Object> getListProducts() {
        return listProducts;
    }

    public void addProduct(Object object) {
        listProducts.add(object);
    }

    public void printAll() {
        int count = 0;
        System.out.println("Список доступных к заказу товаров:");
        for (Object o : listProducts) {
            count++;
            System.out.println(count + ". " + o);

        }
    }
}
