package home_work.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
/*
    Первое задание:
    Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
*/
        guessNumber();

//  Второе задание с угаданиваем слов
        guessWord();

//  Привести предложение к читаемому виду
        text();
    }

    public static void guessNumber() {
        int guessNumber = random.nextInt(10);
        int count = 0;
        do{
            System.out.println("Введите число от 0 до 9");
            int num = sc.nextInt();
            if(num < guessNumber) {
                System.out.println("Введенное число меньше загаданного");
            }
            else if(num > guessNumber) {
                System.out.println("Введенное число больше загаданного");
            }
            else {
                System.out.println("Вы угадали!\n");
                break;
            }
            count++;
        } while(count < 3);
        if(count == 3) System.out.println("\nПопытки закончились!\n");
        System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
        int oneMoreTime = sc.nextInt();
        if(oneMoreTime == 1) {
            guessNumber();
        } else if(oneMoreTime == 0) {
            System.out.println("До свидания!");
        }
    }

    public static void guessWord() {
        String[] words = {  "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                            "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int wordNumber = random.nextInt(words.length);
        StringBuilder str = new StringBuilder("###############");
        System.out.println("Индекс слова в массиве: " + wordNumber); // Подсказка
        while(true) {
            System.out.println("Введите загаданное слово: " + str.toString());
            String answer = sc.nextLine();
            if(answer.equals(words[wordNumber])) {
                System.out.println("Вы угалади!\n");
                break;
            } else {
                for (int i = 0; i < words[wordNumber].length() && i < answer.length(); i++) {
                    if(answer.charAt(i) == words[wordNumber].charAt(i)) {
                        str.setCharAt(i, words[wordNumber].charAt(i));
                    }
                }
            }
        }
        sc.close();
    }

    public static void text() {
        String s = "Предложение     один  Теперь     предложение    два   Тут  предложение          три";
        System.out.println(s); // Наше предложение
        String s1 = s.replaceAll(" +", " "); // Убираем лишние пробелы
        StringBuilder str = new StringBuilder(s1); // Конвертируем в объект StringBuilder
        // Проходим по всем символам и ищем заглавные буквы, вставляем перед ними точку
        for (int i = 1; i < s1.length(); i++) {
            if(s1.charAt(i) >= 'А' && s1.charAt(i) <= 'Я') {
                str.setCharAt(i - 1, '.');
            }
        }
        str.insert(str.length(), '.'); // Вставляем точку в конце всей строки
        String s2 = new String(str); // Конвертируем обратно в объект String
        String s3 = s2.replaceAll("\\.", ". "); // Ищем в строке точку и заменяем её точкой с пробелом
        System.out.println(s3);
    }
}