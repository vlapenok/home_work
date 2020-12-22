package home_work.lesson_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Cat bars = new Cat("Барсик", 300, 2, 10);
        Cat kuz = new Cat("Кузя", 200, 2, 7);
        Dog dina = new Dog("Дина", 500, 15, 2);
        Dog villi = new Dog("Вилли", 250, 7, 1);

        Animal[] animals = {bars, kuz, dina, villi};
        int toRun = rnd.nextInt(600);
        int toSwim = rnd.nextInt(30);
        int toJump = rnd.nextInt(15);

        for (Animal animal : animals) {

            String canRun = animal.run(toRun) ? "добежит" : "не добежит";
            String animalMaxRun = animal.getType() + " " + animal.getName() + " бежит максимум " + animal.getMaxRun() + " метров, ";
            String run = "если " + animal.getName() + " назначить расстояние в " + toRun + " метров, то он " + canRun + ".";
            System.out.println(animalMaxRun + run);

            String canJump = animal.jump(toJump) ? "допрыгнет" : "не допрыгнет";
            String animalMaxJump = animal.getType() + " " + animal.getName() + " прыгает на " + animal.getMaxJump() + " метра, ";
            String jump = "если " + animal.getName() + " дать высоту в " + toJump + " метра, то он " + canJump + ".";
            System.out.println(animalMaxJump + jump);

            int checkSwim = animal.swim(toSwim);
            String canSwim = checkSwim == animal.swimOk ? "доплывет" : "не доплывет";
            if(checkSwim == animal.dontSwim) canSwim = "не полезет в воду";
            String animalMaxSwim = animal.getType() + " " + animal.getName() + " плавает на " + animal.getMaxSwim() + " метров, ";
            String swim = "если " + animal.getName() + " назначить расстояние в " + toSwim + " метров, то он " + canSwim + ".";
            System.out.println(animalMaxSwim + swim);

            System.out.println();
        }
    }
}