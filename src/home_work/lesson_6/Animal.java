package home_work.lesson_6;

public abstract class Animal {
    int swimOk = 1;
    int swimNo = 0;
    int dontSwim = -1;

    private String type; // кошка или собака или др животное
    private String name;
    private int maxRun;
    private int maxSwim;
    private int maxJump;

    Animal(String type, String name, int run, int swim, int jump) {
        this.type = type;
        this.name = name;
        this.maxRun = run;
        this.maxSwim = swim;
        this.maxJump = jump;
    }

    String getType() {
        return this.type;
    }
    String getName() {
        return this.name;
    }

    int getMaxRun() {
        return this.maxRun;
    }

    int getMaxJump() {
        return this.maxJump;
    }

    int getMaxSwim() {
        return this.maxSwim;
    }

    boolean run(int distance) {
        return distance < maxRun;
    }

    boolean jump(int distance) {
        return distance < maxJump;
    }

    int swim(int distance) {
        return distance < maxSwim ? swimOk : swimNo;
    }

}

