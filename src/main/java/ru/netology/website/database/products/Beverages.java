package ru.netology.website.database.products;

import java.time.LocalDate;

public class Beverages extends Product implements Expiretable{
    public Beverages(String name) {
        super(name);
    }

    @Override
    public LocalDate expirationDate() {
        return null;
    }

    @Override
    public void algorithmCheckingGoodsUponAcceptance() {
        System.out.println("Проверить не истёк ли срок годности и нет ли повреждений на бутылках");
    }
}
