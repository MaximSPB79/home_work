package lesson_2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(checkingSumNumbers(4, 15));
        determiningSignNumber(-45);
        System.out.println(definitionSign(45));
        printString("Второй урок", 7);
        System.out.println(calculatingLeapYear(1900));
    }

    public static boolean checkingSumNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    private static void determiningSignNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static boolean definitionSign(int x) {
        if (x >= 0) {
            return true;
        }
        return false;
    }

    public static void printString(String b, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    private static boolean calculatingLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

}