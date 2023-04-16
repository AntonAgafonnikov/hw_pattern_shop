package ru.netology.website.database.products;

import java.time.LocalDate;

public class Yummy extends Product implements Expiretable {
    public Yummy(String name) {
        super(name);
    }

    @Override
    public LocalDate expirationDate() {
        return null;
    }

    @Override
    public void algorithmCheckingGoodsUponAcceptance(){
        System.out.println("Проверить не истёк ли срок годности");
    }
}
