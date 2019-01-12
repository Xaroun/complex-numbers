package elements;

/**
 * Created by mateusz on 12.01.2019.
 */
public class Qbit {

    private ComplexNumber zeroProb;
    private ComplexNumber oneProb;

    public Qbit(ComplexNumber zeroProb, ComplexNumber oneProb) {
        this.zeroProb = zeroProb;
        this.oneProb = oneProb;
        if (!validateQbit()) {
            throw new IllegalArgumentException("INVALID QBIT");
        }
    }

    private boolean validateQbit() {
        ComplexNumber alphaModule = zeroProb.multiply(zeroProb).module();
        ComplexNumber betaModule = oneProb.multiply(oneProb).module();
        return alphaModule.add(betaModule).equals(new ComplexNumber(1, 0));
    }

    @Override
    public String toString() {
        return zeroProb + " |0> + " + oneProb + " |1>\n";
    }
}
