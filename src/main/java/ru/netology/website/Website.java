package ru.netology.website;

import ru.netology.website.database.complaints.ComplaintDatabase;
import ru.netology.website.database.orders.OrderDatabase;
import ru.netology.website.database.products.ProductDatabase;
import ru.netology.website.database.users.UserDatabase;
import ru.netology.website.database.products.Beverages;
import ru.netology.website.database.products.Electronics;
import ru.netology.website.database.products.Yummy;

public class Website {
    private UserDatabase userDatabase;
    private ProductDatabase productDatabase;
    private ComplaintDatabase complaintDatabase;
    private OrderDatabase orderDatabase;

    public Website() {
        userDatabase = new UserDatabase();
        productDatabase = new ProductDatabase();
        complaintDatabase = new ComplaintDatabase();
        orderDatabase = new OrderDatabase();
        System.out.println("Новости: У магазина появился сайт!");
    }

    public UserDatabase getUserDatabase() {
        return userDatabase;
    }

    public ProductDatabase getProductDatabase() {
        return productDatabase;
    }

    public ComplaintDatabase getComplaintDatabase() {
        return complaintDatabase;
    }

    public OrderDatabase getOrderDatabase() {
        return orderDatabase;
    }

    public void registrationBonusCard(String phoneNumber) {
        userDatabase.addUser(phoneNumber);
        System.out.println("Поздравляем! Вы зарегистрированы в бонусной программе!\n");
    }

    public void submitComplaint(String content) {
        complaintDatabase.addComplaint(content);
    }

    public void printAvailableProducts() {
        productDatabase.printAll();
    }

    public void orderProducts(String orderDetails) {
        String[] text = orderDetails.split(" ");
        int indexProduct = Integer.parseInt(text[0]);

        Object obj = productDatabase.getListProducts().get(indexProduct);
        int amount = Integer.parseInt(text[text.length-1]);

        orderDatabase.addOrder(obj, amount);
        System.out.println("Заказ сформирован!\n");

    }

    public void deliveryOfGoodsToStore() {
        System.out.println("Новости: Сегодня в магазин завезли товар!");
        productDatabase.addProduct(new Beverages("Coca-Koka"));
        productDatabase.addProduct(new Electronics("USB-cable"));
        productDatabase.addProduct(new Yummy("M&M"));
    }
}
