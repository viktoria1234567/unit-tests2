import seminars.first.model.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {

        assertThat(Calculator.calculatingDiscount(200, 20)).isEqualTo(160);
        assertThat(Calculator.calculatingDiscount(-200, 20));
        assertThat(Calculator.calculatingDiscount(0, 20));
        assertThat(Calculator.calculatingDiscount(200, -20));
        assertThat(Calculator.calculatingDiscount(200, 0));
        assertThat(Calculator.calculatingDiscount(200, 100));
        assertThat(Calculator.calculatingDiscount(200, 120));

    }
}