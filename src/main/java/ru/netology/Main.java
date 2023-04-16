package ru.netology;

import ru.netology.staff.Director;
import ru.netology.staff.Position;
import ru.netology.website.Website;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Новости: Сегодня закончилось строительство нового магазина по адресу - ул. Лима 23.");

        Director director = new Director("Александр", "Невский", 150000);
        director.hireEmployee("Дмитрий", "Гусев", 70000, Position.MANAGER);
        director.hireEmployee("Олег", "Туров", 45000, Position.WAREHOUSE_WORKER);

        Website website = new Website();
        website.deliveryOfGoodsToStore();

        System.out.println();
        System.out.println("\\*о*/  Добро пожаловать на сайт магазина \"Всё по 99\"  \\*о*/");
        try (Scanner scanner = new Scanner(System.in)) {
            loop:
            while (true) {
                System.out.println("Введите номер услуги, которую хотите получить:" +
                        "\n 1 - Заказать товар;" +
                        "\n 2 - Оформить бонусную карту;" +
                        "\n 3 - Оставить жалобу;" +
                        "\n 4 - Покинуть сайт.");
                String input = scanner.nextLine();
                switch (input) {

                    case "1":
                        website.printAvailableProducts();
                        System.out.println("Введите номер и количество товара через пробел");
                        input = scanner.nextLine();
                        website.orderProducts(input);
                        break;

                    case "2":
                        System.out.println("Для регистрации в бонусной программе введите номер телефона:");
                        input = scanner.nextLine();
                        website.registrationBonusCard(input);
                        break;

                    case "3":
                        System.out.println("Что вас конкретно не устроило?");
                        input = scanner.nextLine();
                        website.submitComplaint(input);
                        System.out.println("Мы сожалеем о сложившейся ситуации. Ваша жалоба передана менеджеру.\n");
                        break;

                    case "4":
                        break loop;

                    default:
                        System.out.println("ОШИБКА! Пожалуйста, введите цифру от 1 до 4.");
                }
            }
        }
    }
}
