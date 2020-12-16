package home_work.lesson_4;

import java.util.Scanner;
import java.util.Random;

class Cross {

    static int size_x = 3;
    static int size_y = 3;

    static char[][] field = new char[size_y][size_x];
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    static char player = 'X';
    static char skyNet = 'O';
    static char dot = '.';

    public static void main(String[] args) {
        initField(); // Заполняем массив точками
        printField(); // Выводим массив на печать

        while (true) {
            playerStep();
            printField();
            if (checkWin(player)) {
                System.out.println("Человек выйграл!");
                break;
            }
            if (isCellFull()) {
                System.out.println("Ничья");
                break;
            }
            skyNetStep();
            printField();
            if (checkWin(skyNet)) {
                System.out.println("SkyNet выйграл");
                break;
            }
            if (isCellFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    public static void initField() {
        for (int i = 0; i < size_y; i++) {
            for (int j = 0; j < size_x; j++) {
                field[i][j] = dot;
            }
        }
    }

    public static void printField() {
        System.out.println("-------");
        for (int i = 0; i < size_y; i++) {
            for (int j = 0; j < size_x; j++) {
                System.out.print("|" + field[i][j]);
            }
            System.out.print("|\n");
        }
        System.out.println("-------");
    }

    public static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    public static boolean isCellValid(int y, int x) {
        if(x >= 0 || y >= 0 || x < size_y || y < size_x) return field[y][x] == dot;
        else return false;
    }

    public static boolean isCellFull() {
        for (int i = 0; i < size_y; i++) {
            for (int j = 0; j < size_x; j++) {
                if(field[i][j] == dot) return false;
            }

        }
        return true;
    }

    public static void playerStep() {
        int x, y;
        do {
            System.out.print("Введите координату Х: ");
            x = sc.nextInt() - 1;
            System.out.print("Введите координату Y: ");
            y = sc.nextInt() - 1;
        } while(!isCellValid(y, x));
        setSym(y, x, player);
    }

    public static void skyNetStep() {
        int x, y;
        do {
            System.out.println("Ходит SkyNet");
            x = rnd.nextInt(size_x);
            y = rnd.nextInt(size_y);
        } while(!isCellValid(y, x));
        setSym(y, x, skyNet);
    }

    static boolean checkWin(char sym) {
        for (int i = 0; i < 3; i++) {
            if(field[i][0] == sym && field[i][1] == sym && field[i][2] == sym) return true;
            else if(field[0][i] == sym && field[1][i] == sym && field[2][i] == sym) return true;
            else if(field[0][0] == sym && field[1][1] == sym && field[2][2] == sym) return true;
            else if(field[2][0] == sym && field[1][1] == sym && field[0][2] == sym) return true;
        }
        return false;
    }
}