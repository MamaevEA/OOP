package OOP_Lesson_4_HW_1;

import java.util.List;

public class Calculator {
    public static int sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int multiply(List<Integer> numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }

    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return dividend / divisor;
    }

    public static String binaryConversion(int number) {
        return Integer.toBinaryString(number);
    }
}
