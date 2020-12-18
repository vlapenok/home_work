package home_work.lesson_5; // ДЗ по ООП

public class Employee {
    String name;
    String function;
    String email;
    long phone;
    short salary;
    byte age;

    public Employee(String name, String function, String email, long phone, short salary, byte age) {

        this.name = name;
        this.function = function;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println(name + "\n" + function + "\n" + email + "\n" + phone + "\n" + salary + "\n" + age);
        System.out.println("-----------------------");
    }
}
