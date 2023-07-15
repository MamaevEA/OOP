package OOP_Lesson_3_HW_1;

public class Cows {
    public static int countCows(int[] secretNumber, int[] guess) {
        int cows = 0;

        for (int i = 0; i < secretNumber.length; i++) {
            for (int j = 0; j < guess.length; j++) {
                if (secretNumber[i] == guess[j] && i != j) {
                    cows++;
                }
            }
        }

        return cows;
    }
}

