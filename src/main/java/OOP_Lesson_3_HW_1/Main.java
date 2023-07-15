package OOP_Lesson_3_HW_1;

import java.util.Scanner;

import static OOP_Lesson_3_HW_1.Bulls.countBulls;
import static OOP_Lesson_3_HW_1.Cows.countCows;
import static OOP_Lesson_3_HW_1.Guess.readGuess;
import static OOP_Lesson_3_HW_1.SecretNumber.generateSecretNumber;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру \"Быки и коровы\"!");
        System.out.println("Я загадаю четырехзначное число, а вы должны попытаться его угадать.");

        int[] secretNumber = generateSecretNumber();
        boolean gameOver = false;

        while (!gameOver) {
            System.out.print("Введите вашу попытку: ");
            int[] guess = readGuess(scanner);

            int bulls = countBulls(secretNumber, guess);
            int cows = countCows(secretNumber, guess);

            if (bulls == 4) {
                System.out.println("Поздравляю, вы угадали число!");
                gameOver = true;
            } else {
                System.out.println("Коровы: " + cows + ", быки: " + bulls);
            }
        }
    }
}
