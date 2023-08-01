package OOP_Lesson_7_HW_1;

public class ComplexCalculator {
    private final Logger logger;

    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        logger.log("Adding " + num1 + " and " + num2);
        ComplexNumber result = num1.add(num2);
        logger.log("Result: " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        logger.log("Multiplying " + num1 + " and " + num2);
        ComplexNumber result = num1.multiply(num2);
        logger.log("Result: " + result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        logger.log("Dividing " + num1 + " by " + num2);
        ComplexNumber result = num1.divide(num2);
        logger.log("Result: " + result);
        return result;
    }
}
