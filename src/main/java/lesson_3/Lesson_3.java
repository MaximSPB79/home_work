package lesson_3;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {

        changeNumbers();
        System.out.println();

        creating100();
        System.out.println();

        multiplyNumbers();
        System.out.println();

        makingSquare();
        System.out.println();


        System.out.println(Arrays.toString(returnsArray(12, 5)));
        System.out.println();

        findingMinMaxNumbers();
        System.out.println();

        int[] mass = {1, 2, 3, 7, 5, 8, 10};
        System.out.println(arrBalance(mass));
        System.out.println();


        int[] arr = {1, 2, 3, 4};
        movingArray(arr, 3);
    }

    private static void changeNumbers() {
        int[] numbers = {1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0,};
        System.out.println(Arrays.toString(numbers));
        System.out.println("Меняем нули на единички. Вуаля...");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else numbers[i] = 1;
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void creating100() {
        System.out.println("Это просто массив из 100 чисел");
        int[] weaving = new int[100];
        for (int i = 0; i < weaving.length; i++) {
            weaving[i] = i + 1;
        }
        System.out.println(Arrays.toString(weaving));
    }

    private static void multiplyNumbers() {
        System.out.println("Исходный массив:");
        int[] nambers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(nambers));
        System.out.println("Числа, которые меньше 6, умножим на 2:");
        for (int i = 0; i < nambers.length; i++) {
            if (nambers[i] < 6) {
                nambers[i] = nambers[i] * 2;
            }
        }
        System.out.println(Arrays.toString(nambers));
    }


    private static void makingSquare() {
        System.out.println("Сделаем диагонали из единичек.");
        System.out.println();
        int[][] square = new int[8][8];
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
            square[i][square.length - 1 - i] = 1;
        }
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++)
                System.out.print(square[i][j] + "  ");
            System.out.println();

        }
    }

    private static int @NotNull [] returnsArray(int len, int initalValue) {
        System.out.println("Возвратим массив:");
        System.out.println();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initalValue;
        }
        return arr;
    }

    private static void findingMinMaxNumbers() {
        int[] num = {0, 12, 56, -45, 458, -78, 25, 36, 99};
        int numMax = 0; // Инициализируем переменные, чтобы запустился цикл
        int numMin = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > numMax) {
                numMax = num[i];
            }
            if (num[i] < numMin) {
                numMin = num[i];
            }
        }
        System.out.println("Максимальное число в массиве " + numMax);
        System.out.println("Минимальное число в массиве " + numMin);
    }

    private static boolean arrBalance(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum = sum + mass[j];
            }
            for (int j = i; j < mass.length; j++) {
                sum = sum - mass[j];
            }
            if (sum == 0)
                return true;
        }
        return false;
    }

    private static void movingArray(int[] arr, int shift) {
        for (int n = 0; n < shift; n++) {
            int buf = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = buf;
        }
            System.out.println(Arrays.toString(arr));

    }
}



