package elements;

import java.util.Objects;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ComplexNumber {
    private double realUnit;
    private double imagineUnit;

    public ComplexNumber(double realUnit, double imagineUnit) {
        this.realUnit = realUnit;
        this.imagineUnit = imagineUnit;
    }

    public ComplexNumber add(ComplexNumber number) {
        this.realUnit += number.realUnit;
        this.imagineUnit += number.imagineUnit;
        return new ComplexNumber(realUnit, imagineUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexNumber)) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.realUnit, realUnit) == 0 &&
                Double.compare(that.imagineUnit, imagineUnit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(realUnit, imagineUnit);
    }

    @Override
    public String toString() {
        return realUnit + " + " + imagineUnit + "i";
    }

    public ComplexNumber subtract(ComplexNumber number) {
        this.realUnit -= number.realUnit;
        this.imagineUnit -= number.imagineUnit;
        return new ComplexNumber(realUnit, imagineUnit);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double tmpRealUnit = this.realUnit * number.realUnit + -(this.imagineUnit * number.imagineUnit);
        double tmpImagineUnit = (this.realUnit * number.imagineUnit) + (this.imagineUnit * number.realUnit);
        return new ComplexNumber(tmpRealUnit, tmpImagineUnit);
    }

    public ComplexNumber divide(ComplexNumber number) {
        ComplexNumber reversedNumber = number.conjugate();

        ComplexNumber numerator = this.multiply(reversedNumber);
        ComplexNumber denominator = number.multiply(reversedNumber);

        return new ComplexNumber(numerator.realUnit / denominator.realUnit, numerator.imagineUnit / denominator.realUnit);
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(this.realUnit, -this.imagineUnit);
    }

    public ComplexNumber module() {
        return new ComplexNumber(sqrt(pow(this.realUnit, 2) + pow(this.imagineUnit, 2)), 0);
    }
}
