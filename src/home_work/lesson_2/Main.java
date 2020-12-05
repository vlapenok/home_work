package home_work.lesson_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Первое задание
        System.out.println("Первое задание:");
        int[] arr = {1,1,0,1,0,0,1,1,0};
        revers(arr);

        // Второе задание
        System.out.println("\nВторое задание:");
        int[] arr1 = new int[8];
        fill(arr1);

        // Третье задание
        System.out.println("\nТретье задание:");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        lessSix(arr3);

        // Четвертое задание
        System.out.println("\nЧетвертое задание:");
        int[][] arr4 = new int[10][10];
        diagonal(arr4);

        // Пятое задание
        System.out.println("\nПятое задание:");
        int[] arr5 = {-10,70,-15,90,40,10,20,28,-32,0};
        System.out.println("Минимальное значение: " + min(arr5));
        System.out.println("Максимальное значение: " + max(arr5));

        // Шестое задание
        System.out.println("\nШестое задание:");
        int[] arr6 = {8,1,2,1,6,1,2,2,3};
        System.out.print("Есть ли место где две части массива равны? Ответ: ");
        System.out.println(checkBalance(arr6));

        // Седьмое задание
        System.out.println("\nСедьмое задание:");
        int[] arr7 = {1,2,3,4,5,6};
        offset(arr7, -3);
    }

    public static void revers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            switch(arr[i]) {
                case 0 : arr[i] = 1; break;
                case 1 : arr[i] = 0; break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fill(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3; // к первому элементу не обращаемся, т.к. по условию он и так ноль
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void lessSix(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] < 6) arr[i] *= 2;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void diagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][i] = 1;
                arr[i][(arr.length - 1) - i] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= min) min = arr[i];
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[arr.length - 1];
        int count = arr.length - 1;
        while(count > 0) {
            if(arr[count] > max) max = arr[count];
            count--;
        }
        return max;
    }

    public static boolean checkBalance(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum % 2 == 0;
    }

    public static void offset(int[] arr, int n) {
        int t;
        if(n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        } else if(n < 0) {
            for (int i = 0; i > n; i--) {
                for (int j = 0; j < arr.length - 1; j++) {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        } else System.out.println("Сдвиг равен нулю, массив не трогаем.");
        System.out.println(Arrays.toString(arr));
    }
}