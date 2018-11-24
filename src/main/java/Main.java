import elements.ComplexNumber;
import elements.Vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//        ComplexNumber addResult = firstNumber.add(secondNumber);
//        System.out.println(addResult);

//        ComplexNumber subtractResult = firstNumber.subtract(secondNumber);
//        System.out.println(subtractResult);

//        ComplexNumber multiplyResult = firstNumber.multiply(secondNumber);
//        System.out.println(multiplyResult);

//        ComplexNumber divisionResult = firstNumber.divide(secondNumber);
//        System.out.println(divisionResult);

//        ComplexNumber moduleResult = firstNumber.module();
//        System.out.println(moduleResult);

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

//        List<ComplexNumber> complexNumbers = Vector.addition(w, v);
//        System.out.println(complexNumbers);

//        List<ComplexNumber> complexNumbers2 = Vector.subtraction(w, v);
//        System.out.println(complexNumbers2);

//        List<ComplexNumber> complexNumbers3 = Vector.scalarMultiply(v, new ComplexNumber(1, 1));
//        System.out.println(complexNumbers3);

        ComplexNumber complexNumbers4 = Vector.multiply(v, w);
        System.out.println(complexNumbers4);

    }
}
