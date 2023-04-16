package ru.netology.website.database.products;

public class Electronics extends Product{
    public Electronics(String name) {
        super(name);
    }

    @Override
    public void algorithmCheckingGoodsUponAcceptance() {
        System.out.println("Проверить нет ли повреждений на коробках");
    }
}
