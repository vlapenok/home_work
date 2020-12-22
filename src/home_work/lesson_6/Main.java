package home_work.lesson_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Cat cat = new Cat("Барсик", 200, 2, 7);
        Dog dog = new Dog("Тузик", 500, 15, 2);

        Animal[] animals = {cat, dog};
        int toRun = rnd.nextInt(600);
        int toSwim = rnd.nextInt(30);
        int toJump = rnd.nextInt(10);

        for (Animal animal : animals) {

            String canRun = animal.run(toRun) ? "добежит" : "не добежит";
            String animalMaxRun = animal.getType() + " " + animal.getName() + " бежит максимум " + animal.getMaxRun() + " метров, ";
            String run = "если " + animal.getName() + "у назначить расстояние в " + toRun + " метров, то он " + canRun + ".";
            System.out.println(animalMaxRun + run);

            String canJump = animal.jump(toJump) ? "допрыгнет" : "не допрыгнет";
            String animalMaxJump = animal.getType() + " " + animal.getName() + " прыгает на " + animal.getMaxJump() + " метра, ";
            String jump = "если " + animal.getName() + "у дать высоту в " + toJump + " метра, то он " + canJump + ".";
            System.out.println(animalMaxJump + jump);

            int checkSwim = animal.swim(toSwim);
            String canSwim = checkSwim == animal.swimOk ? "доплывет" : "не доплывет";
            if(checkSwim == animal.dontSwim) canSwim = "не полезет в воду";
            String animalMaxSwim = animal.getType() + " " + animal.getName() + " плавает на " + animal.getMaxSwim() + " метров, ";
            String swim = "если " + animal.getName() + "у назначить расстояние в " + toSwim + " метров, то он " + canSwim + ".";
            System.out.println(animalMaxSwim + swim);

            System.out.println();
        }
    }
}