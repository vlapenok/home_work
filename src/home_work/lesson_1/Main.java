package home_work.lesson_1;

public class Main {
    public static void main(String[] args) {

        // Целочисленные переменные
        byte b = 100; // -128...127 (8 бит)
        short s = 10000; // -32768...32767 (16 бит)
        int i = 1000000000; // -2147483648...2147483647 (32 бита)
        long l = 10000000000L; // -9223372036854775808...9223372036854775807 (64 бита)

        // Вещественные переменные (с плавающей точкой)
        float f = 123.123f; // 32 бита
        double d = 123456.123456; // 64 бита

        // Логическая переменная
        boolean t = true; // по-умолчанию false

        // Символьная переменная
        char c = 'J'; // хранит данные в формате unicode
        char c1 = '\u004a';

        System.out.println(method(23f, 37f, 65f, 21f)); // почему округление только до 4 знака?

        System.out.println(compare(7, 8));

        positive(1982);

        System.out.println(negative(-25));

        name("Вадим");

        year(2020);
    }

    // метод возвращает число float
    public static float method(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // метод возвращает логическое значение
    public static boolean compare(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    // метод печатает в консоль текст
    public static void positive(int num) {
        if (num >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    // метод возвращает обратное логическое значение
    public static boolean negative(int num) {
        return !(num >= 0);
    }

    // метод ничего не возвращает, печатает в консоль
    public static void name(String name) {
        System.out.println("\"Привет, " + name + "!\"");
    }

    // метод для определения високосного года
    public static void year(int year) {
        if (year%400==0 || year%4==0 && year%100!=0) {
            System.out.println("Год високосный");
        } else System.out.println("Год обычный");
    }
}