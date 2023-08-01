package OOP_Lesson_7_HW_1;

public class Complex implements ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realPartSum = this.realPart + other.getRealPart();
        double imaginaryPartSum = this.imaginaryPart + other.getImaginaryPart();
        return new Complex(realPartSum, imaginaryPartSum);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPartProduct = this.realPart * other.getRealPart() - this.imaginaryPart * other.getImaginaryPart();
        double imaginaryPartProduct = this.realPart * other.getImaginaryPart() + this.imaginaryPart * other.getRealPart();
        return new Complex(realPartProduct, imaginaryPartProduct);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.getRealPart() * other.getRealPart() + other.getImaginaryPart() * other.getImaginaryPart();
        double realPartQuotient = (this.realPart * other.getRealPart() + this.imaginaryPart * other.getImaginaryPart()) / denominator;
        double imaginaryPartQuotient = (this.imaginaryPart * other.getRealPart() - this.realPart * other.getImaginaryPart()) / denominator;
        return new Complex(realPartQuotient, imaginaryPartQuotient);
    }
}

