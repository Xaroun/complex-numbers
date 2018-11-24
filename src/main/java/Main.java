import elements.ComplexNumber;
import elements.Vector;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ComplexNumber firstNumber = new ComplexNumber(1, 2);
        ComplexNumber secondNumber = new ComplexNumber(3, -4);

        //Dodawanie
        System.out.println("Dodawanie: " + firstNumber + " oraz " + secondNumber + " = " + firstNumber.add(secondNumber));

        //Odejmowanie
        System.out.println("Odejmowanie: " + firstNumber + " oraz " + secondNumber + " = " + firstNumber.subtract(secondNumber));

        //Mnożenie
        System.out.println("Mnożenie: " + firstNumber + " oraz " + secondNumber + " = " + firstNumber.multiply(secondNumber));

        //Dzielenie
        System.out.println("Dzielenie: " + firstNumber + " oraz " + secondNumber + " = " + firstNumber.divide(secondNumber));

        //Sprzężenie
        System.out.println("Sprzężenie: " + firstNumber + " = " + firstNumber.conjugate());

        //Moduł
        System.out.println("Moduł: " + firstNumber + " = " + firstNumber.module());

        List<ComplexNumber> w = new ArrayList<>();
        w.add(firstNumber);
        w.add(secondNumber);

        ComplexNumber thirdNumber = new ComplexNumber(-1, -1);
        ComplexNumber fourthNumber = new ComplexNumber(2, 1);

        List<ComplexNumber> v = new ArrayList<>();
        v.add(thirdNumber);
        v.add(fourthNumber);

        //Dodawanie wielomianów
        System.out.println("Dodawanie wielomianów: " + v + " oraz " + w + " = " + Vector.addition(v, w));

        //Odejmowanie wielomianów
        System.out.println("Odejmowanie wielomianów: " + v + " oraz " + w + " = " + Vector.subtraction(v, w));

        //Mnożenie skalarne wielomianów
        System.out.println("Mnożenie skalarne wielomianu: " + v + " oraz " + secondNumber + " = " + Vector.scalarMultiply(v, secondNumber));

        //Mnożenie wielomianów
        System.out.println("Mnożenie wielomianu: " + v + " oraz " + w + " = " + Vector.multiply(v, w));

    }
}
