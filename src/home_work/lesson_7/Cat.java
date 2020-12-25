package home_work.lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void getInfo() {
        String goloden = hungry ? "голодный!" : "сытый!";
        System.out.println("Имя: " + name + " Аппетит: " + appetite + " Кот " + goloden);
    }

    public void eat(Plate plate) {
        if(hungry && plate.decreaseFood(appetite)) {
            hungry = false;
            appetite = 0;
        }
        else {
            appetite = plate.notAFullPlate(appetite);
        }
    }
}
