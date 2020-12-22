package home_work.lesson_6;

public class Cat extends Animal {

    Cat(String name, int run, int swim, int jump) {
        super("Кот", name, run, swim, jump);
    }

    @Override
    int swim(int distance) {
        return dontSwim;
    }
}

