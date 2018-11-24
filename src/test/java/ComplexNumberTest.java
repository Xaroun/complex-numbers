import elements.ComplexNumber;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ComplexNumberTest {

    ComplexNumber firstNumber;
    ComplexNumber secondNumber;

    @Before
    public void setUp() {
        firstNumber = new ComplexNumber(2, 4);
        secondNumber = new ComplexNumber(2, -6);
    }

    @Test
    public void shouldAdd() {
        ComplexNumber result = firstNumber.add(secondNumber);

        assertThat(result.getRealUnit()).isEqualTo(4);
        assertThat(result.getImagineUnit()).isEqualTo(-2);
    }

    @Test
    public void shouldSubtract() {
        ComplexNumber result = firstNumber.subtract(secondNumber);

        assertThat(result.getRealUnit()).isEqualTo(0);
        assertThat(result.getImagineUnit()).isEqualTo(10);
    }

    @Test
    public void shouldMultiply() {
        ComplexNumber result = firstNumber.multiply(secondNumber);

        assertThat(result.getRealUnit()).isEqualTo(28);
        assertThat(result.getImagineUnit()).isEqualTo(-4);
    }

    @Test
    public void shouldDivide() {
        ComplexNumber result = firstNumber.divide(secondNumber);

        assertThat(result.getRealUnit()).isEqualTo(-0.5);
        assertThat(result.getImagineUnit()).isEqualTo(0.5);
    }

    @Test
    public void shouldConjugate() {
        ComplexNumber result = firstNumber.conjugate();

        assertThat(result.getRealUnit()).isEqualTo(2);
        assertThat(result.getImagineUnit()).isEqualTo(-4);
    }

    @Test
    public void shouldModule() {
        ComplexNumber result = firstNumber.module();

        assertThat(result.getRealUnit()).isEqualTo(4.47213595499958);
        assertThat(result.getImagineUnit()).isEqualTo(0);
    }
}
