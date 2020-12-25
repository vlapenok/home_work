package home_work.lesson_7;

public class Plate {
    int food;

    Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if((food - appetite) >= 0) {
            food = food - appetite;
            return true;
        }
        else return false;
    }

    public int notAFullPlate(int appetite) {
        int temp = appetite - food;
        this.food = 0;
        return temp;
    }

    // метод добавления еды в тарелку
    void addFood(int food) {
        this.food += food;
        System.out.println("накинули еды " + this.food);
    }

    void getInfo() {
        System.out.println("Остаток еды в тарелке: " + food);
    }
}
