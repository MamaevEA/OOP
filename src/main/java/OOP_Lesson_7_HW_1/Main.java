package OOP_Lesson_7_HW_1;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        ComplexCalculator calculator = new ComplexCalculator(logger);

        ComplexNumber num1 = new Complex(2, 3);
        ComplexNumber num2 = new Complex(1, -2);

        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);
    }
}
