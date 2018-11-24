import elements.ComplexNumber;
import elements.Vector;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class VectorTest {

    List<ComplexNumber> firstVector;
    List<ComplexNumber> secondVector;

    @Before
    public void setUp() {
        firstVector = Arrays.asList(
                new ComplexNumber(1, 2), new ComplexNumber(3, -4));
        secondVector = Arrays.asList(
                new ComplexNumber(-1, -1), new ComplexNumber(2, 1));
    }

    @Test
    public void shouldAdd() {
        List<ComplexNumber> addedVectors = Vector.addition(firstVector, secondVector);

        assertThat(addedVectors.size()).isEqualTo(2);

        ComplexNumber firstNumber = addedVectors.get(0);
        ComplexNumber secondNumber = addedVectors.get(1);

        assertThat(firstNumber.getRealUnit()).isEqualTo(0);
        assertThat(firstNumber.getImagineUnit()).isEqualTo(1);
        assertThat(secondNumber.getRealUnit()).isEqualTo(5);
        assertThat(secondNumber.getImagineUnit()).isEqualTo(-3);
    }

    @Test
    public void shouldSubtract() {
        List<ComplexNumber> subtractedVectors = Vector.subtraction(firstVector, secondVector);

        assertThat(subtractedVectors.size()).isEqualTo(2);

        ComplexNumber firstNumber = subtractedVectors.get(0);
        ComplexNumber secondNumber = subtractedVectors.get(1);

        assertThat(firstNumber.getRealUnit()).isEqualTo(2);
        assertThat(firstNumber.getImagineUnit()).isEqualTo(3);
        assertThat(secondNumber.getRealUnit()).isEqualTo(1);
        assertThat(secondNumber.getImagineUnit()).isEqualTo(-5);
    }

    @Test
    public void shouldMultiplyScalarly() {
        List<ComplexNumber> multipliedVectors = Vector.scalarMultiply(secondVector, new ComplexNumber(1, 1));

        assertThat(multipliedVectors.size()).isEqualTo(2);

        ComplexNumber firstNumber = multipliedVectors.get(0);
        ComplexNumber secondNumber = multipliedVectors.get(1);

        assertThat(firstNumber.getRealUnit()).isEqualTo(0);
        assertThat(firstNumber.getImagineUnit()).isEqualTo(-2);
        assertThat(secondNumber.getRealUnit()).isEqualTo(1);
        assertThat(secondNumber.getImagineUnit()).isEqualTo(3);
    }

    @Test
    public void shouldMultiply() {
        ComplexNumber multiplied = Vector.multiply(firstVector, secondVector);

        assertThat(multiplied.getRealUnit()).isEqualTo(-1);
        assertThat(multiplied.getImagineUnit()).isEqualTo(-12);
    }

}
