package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 9;
    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char[][] MAP = new char[SIZE][SIZE];
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static final String HEADER_FIRST_SYMBOL = "♥";
    private static final String SPACE_MAP = " ";
    private static int turnsCount = 0;
    private static int winSize = 4;
    private static int winCount = 0;

    public static void main(String[] args) {

        turnGame(); /* комментарии пишу больше для себя, что бы не потерятся в логике программы. Осознаю что
         в реальной работе они в таком количестве не нужны. И мой английский оставляет желать лучшего))*/

    }

    public static void turnGame() { // запускает игру крестики-нолики
        System.out.println("Игра начинается!");
        initMap(); // инициализирум поле игры
        printMap(); // выводим игровое поле в консоль
        playGame(); // прцесс игры
    }

    private static void initMap() { // инициализирум поле игры
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() { // выводим игровое поле в консоль
        printHeaderMap(); // печать заголовка игрового поля
        printBodyMap(); // печать поля
    }

    private static void printHeaderMap() { // печать заголовка игрового поля
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printNumberMap(i);
        }
        System.out.println();
    }

    private static void printNumberMap(int i) { // печать номера на поле
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printBodyMap() { // печать поля
        for (int i = 0; i < SIZE; i++) {
            printNumberMap(i);

            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            turnHuman();// ход человека
            printMap(); //печать массива
            if (checkEnd(DOT_HUMAN)) {
                break;
            }
            ternAI();// ход компьютера
            printMap(); // печать массива
            if (checkEnd(DOT_AI)) { // проверка хода на окончание игры
                break;
            }
        }


    }

    private static void turnHuman() { // ход человека
        System.out.println("Ваш ход. Ходите пожалуста!");
        int rowNumber, columnNumber;
        while (true) {
            rowNumber = in.nextInt() - 1;
            columnNumber = in.nextInt() - 1;
            if (isSellFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.println("\nВы выбрали занятую ячейку!");
        }
        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;

    }

    private static boolean isSellFree(int rowNumber, int columnNumber) { // проверка на свободную ячейку

        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void ternAI() {
        System.out.println("Ходит компьютер!");
        int rowNumber, columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isSellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;

    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("\nУра мы победили");
            } else {
                System.out.println("\nКомпьтер победил");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("\nНичья!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        return turnsCount >= SIZE * SIZE;
    }


    private static boolean checkWin(char symbol) {
        return checkingMap(symbol) || checkingDiagonalsCenter(symbol);
    }


    private static boolean checkingDiagonalsCenter(char symbol) { // проверка на победу двух центральных диагоналей

        for (int i = 0; i < SIZE; i++) {
            if (MAP[i][i] == symbol || MAP[i][SIZE - 1 - i] == symbol) {
                winCount++;
            } else {
                winCount = 0;
            }
            if (winCount == winSize) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkingMap(char symbol) { // проверка на победу столбцы и строки

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[j][i] == symbol || MAP[i][j] == symbol) {
                    winCount++;
                } else {
                    winCount = 0;
                }
                if (winCount == winSize) {
                    return true;
                }
            }
        }
        return false;
    }


}







