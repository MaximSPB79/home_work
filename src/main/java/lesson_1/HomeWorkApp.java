package lesson_1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = 6, b = -8;
        int c = a + b;
        if (c >= 0)
            System.out.println("Сумма положительная");// написал без фигурных скобок т.к. всего одна строчка в условии
        else System.out.println("Сумма отрицательная");
    }

    private static void printColor() {
        int value = 45;
        if (value <= 0) System.out.println("Красный");
        else if (value > 100) System.out.println("Зеленый");
        else System.out.println("Желтый");
    }

    private static void compareNumbers() {
        int a = 478, b = 562;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

}
