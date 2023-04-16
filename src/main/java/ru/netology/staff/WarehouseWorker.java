package ru.netology.staff;

public class WarehouseWorker extends Staff {
    public WarehouseWorker(String name, String surname, int salary) {
        super(name, surname, salary);
    }

    public void advisingClients() {
        System.out.println(this.getName() + " применяет навыки продаж, чтобы клиент ушёл с товаром подороже.");
    }

    public void registrationBonusCards() {

    }
}
