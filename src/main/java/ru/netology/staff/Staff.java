package ru.netology.staff;

import java.util.Objects;

class Staff {
    private String name;
    private String surname;
    private int salary;

    public Staff(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public void conflictResolution() {
        System.out.println(this.getName() + " справился с урегулированием конфликта");
    }

    public void pressAlarmButton() {
        System.out.println("ВНИМАНИЕ! Вызвана группа быстрого реагирования!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return salary == staff.salary && Objects.equals(name, staff.name) && Objects.equals(surname, staff.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, salary);
    }
}
