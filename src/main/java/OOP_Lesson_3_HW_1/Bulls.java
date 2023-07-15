package OOP_Lesson_3_HW_1;

public class Bulls {
                public static int countBulls (int[] secretNumber, int[] guess){
                        int bulls = 0;

                        for (int i = 0; i < secretNumber.length; i++) {
                                if (secretNumber[i] == guess[i]) {
                                        bulls++;
                                }
                        }

                        return bulls;
                }
        }
