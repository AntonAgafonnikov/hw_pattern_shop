package ru.netology.staff;

import java.util.ArrayList;
import java.util.List;

/*
Single Responsibility Principle
Класс Director предназначен для найма/увольнения новых сотрудников.

Open Closed Principle
Устроиться в магазин возможно только через класс Director.
 */
public class Director extends Staff {
    private List<Object> subordinates;
    public Director(String name, String surname, int salary) {
        super(name, surname, salary);
        subordinates = new ArrayList<>();
        System.out.println("Новости: Учредители магазина нашли нового директора!");
    }

    public List<Object> getSubordinates() {
        return subordinates;
    }

    public void hireEmployee(String name, String surname, int salary, Position position) {
        switch (position) {
            case MANAGER:
                System.out.println("Новости: Директор магазина нанял " + name + " на должность - Менерджер!");
                subordinates.add(new Manager(name, surname, salary));
                break;
            case WAREHOUSE_WORKER:
                System.out.println("Новости: Директор магазина нанял " + name + " на должность - Работник скалада!");
                subordinates.add(new WarehouseWorker(name, surname, salary));
                break;
            default:
                System.out.println("Сейчас нет вакансий на данную позицию.");
        }
    }

    public void dismissEmployee(Object employee) {
        System.out.println("Новости: Директор магазина уволил " + employee.getClass().getName());
        subordinates.remove(employee);
    }
}
