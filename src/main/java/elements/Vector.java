package elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vector {

    public static List<ComplexNumber> addition(List<ComplexNumber> v1, List<ComplexNumber> v2) {
        List<ComplexNumber> result = new ArrayList<>();
        for(int i = 0; i < v1.size(); i++) {
            ComplexNumber tmp = v1.get(i);
            ComplexNumber tmp2 = v2.get(i);

            result.add(tmp.add(tmp2));
        }
        return result;
    }

    public static List<ComplexNumber> subtraction(List<ComplexNumber> v1, List<ComplexNumber> v2) {
        List<ComplexNumber> result = new ArrayList<>();
        for(int i = 0; i < v1.size(); i++) {
            ComplexNumber tmp = v1.get(i);
            ComplexNumber tmp2 = v2.get(i);

            result.add(tmp.subtract(tmp2));
        }
        return result;
    }

    public static List<ComplexNumber> scalarMultiply(List<ComplexNumber> v1, ComplexNumber complexNumber) {
        List<ComplexNumber> result = new ArrayList<>();
        for(int i = 0; i < v1.size(); i++) {
            ComplexNumber tmp = v1.get(i);

            result.add(tmp.multiply(complexNumber));
        }
        return result;
    }

    public static ComplexNumber multiply(List<ComplexNumber> v, List<ComplexNumber> w) {
        List<ComplexNumber> elementsToSum = new ArrayList<>();
        for(int i = 0; i < v.size(); i++) {
            ComplexNumber tmp = v.get(i);
            ComplexNumber tmp2 = w.get(i);

            elementsToSum.add(tmp.multiply(tmp2.conjugate()));
        }

        ComplexNumber sum = elementsToSum.get(0);

        for(int i = 1; i < elementsToSum.size(); i++) {
            sum = sum.add(elementsToSum.get(i));
        }

        return sum;
    }
}
