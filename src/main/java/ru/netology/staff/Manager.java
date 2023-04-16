package ru.netology.staff;

/*
Liskov Substitution Principle
Класс Manager может в любой момент времени взять на себя роль своего предка - класса Staff
 */
public class Manager extends Staff {
    public Manager(String name, String surname, int salary) {
        super(name, surname, salary);
    }

    public void conductingPlanningMeetings(WarehouseWorker ... warehouseWorker) {
        System.out.println(this.getName() + "провел планёрку с сотрудниками : ");
        //warehouseWorker.fo
    }
}
