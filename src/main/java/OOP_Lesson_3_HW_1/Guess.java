package OOP_Lesson_3_HW_1;

import java.util.Scanner;

public class Guess {
    public static int[] readGuess(Scanner scanner) {
        String input = scanner.nextLine();
        char[] inputChars = input.toCharArray();

        int[] guess = new int[4];

        for (int i = 0; i < guess.length; i++) {
            guess[i] = Character.getNumericValue(inputChars[i]);
        }

        return guess;
    }
}
