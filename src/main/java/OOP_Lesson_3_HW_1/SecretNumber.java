package OOP_Lesson_3_HW_1;

public class SecretNumber {
    public static int[] generateSecretNumber() {
        int[] secretNumber = new int[4];

        for (int i = 0; i < secretNumber.length; i++) {
            secretNumber[i] = (int) (Math.random() * 10);
        }

        return secretNumber;
    }

}
