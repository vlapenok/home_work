package home_work.lesson_5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Vadim", "student", "vlapenok@gmail.com", 7_904_333_0_999L, (short)1500, (byte)38);
        employees[1] = new Employee("Natalia", "manager", "natalia@mail.ru", 7_911_895_55_77L, (short)2500, (byte)36);
        employees[2] = new Employee("Anatoly", "buyer", "tolya@mail.ru", 7_921_999_44_55L, (short)1000, (byte)29);
        employees[3] = new Employee("Maxim", "DopOp", "orlov@mail.ru", 7_911_933_55_66L, (short)3000, (byte)38);
        employees[4] = new Employee("Daniil", "kid", "danya@yandex.ru", 7_911_000_00_00L, (short)10, (byte)6);
        System.out.println("Список сотрудников старше 30 лет:");
        System.out.println("-----------------------");
        overForty(employees);
    }

    public static void overForty(Employee[] people) {
        for (int i = 0; i < people.length; i++) {
            if(people[i].age >= 30) {
                people[i].print();
            }
            else {
                System.out.println(people[i].name + " младше 30-и лет");
                System.out.println("-----------------------");
            }
        }
    }
}