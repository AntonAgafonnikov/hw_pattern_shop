package ru.netology.website.database.products;

public abstract class Product {
    private final int PRICE = 99;
    private final String MANUFACTURER_COUNTRY = "China";
    private String name;

    public Product(String name) {
        this.name = name;
    }

    abstract public void algorithmCheckingGoodsUponAcceptance();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " - " + name;
    }
}
