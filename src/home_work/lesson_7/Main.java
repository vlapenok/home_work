package home_work.lesson_7;

import java.util.Random;

public class Main {
    static Random rnd = new Random();

    public static void main(String[] args) {
        Plate plate = new Plate(100);

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Барсик", rnd.nextInt(100));
        cat[1] = new Cat("Мурзик", rnd.nextInt(100));
        cat[2] = new Cat("Тузик", rnd.nextInt(100));

        for (int i = 0; i < cat.length; i++) {
            plate.getInfo();
            cat[i].getInfo(); // Инфо о Коте
            cat[i].eat(plate); // Кормим кота
            System.out.println("Покормили кота");
            cat[i].getInfo();
            plate.getInfo();
            System.out.println();
        }
    }
}