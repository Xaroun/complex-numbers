import elements.ComplexNumber;
import elements.Vector;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ComplexNumber firstNumber = new ComplexNumber(1, 2);
        ComplexNumber secondNumber = new ComplexNumber(3, -4);

        List<ComplexNumber> w = new ArrayList<>();
        w.add(firstNumber);
        w.add(secondNumber);

        ComplexNumber thirdNumber = new ComplexNumber(-1, -1);
        ComplexNumber fourthNumber = new ComplexNumber(2, 1);

        List<ComplexNumber> v = new ArrayList<>();
        v.add(thirdNumber);
        v.add(fourthNumber);

        ComplexNumber multipliedVectors = Vector.multiply(w, v);
        System.out.println(multipliedVectors);
    }
}
