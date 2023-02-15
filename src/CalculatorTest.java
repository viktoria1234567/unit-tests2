import seminars.first.model.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {

        assertThat(Calculator.calculatingDiscount(200, 20)).isEqualTo(160); //правильная работа метода
        assertThat(Calculator.calculatingDiscount(1, 1)).isEqualTo(0.99);
        assertThat(Calculator.calculatingDiscount(9.99, 3)).isEqualTo(9.6903);

        assertThatThrownBy(() -> {
            Calculator.calculatingDiscount(-200, 20);
        }).isInstanceOf(ArithmeticException.class); // при отрицательной сумме покупки

        assertThatThrownBy(() -> {
            Calculator.calculatingDiscount(0, 20);
        }).isInstanceOf(ArithmeticException.class); // при отсутствии суммы покупки

        assertThatThrownBy(() -> {
            Calculator.calculatingDiscount(200, -20);
        }).isInstanceOf(ArithmeticException.class); // при отрицательной скидке

        assertThatThrownBy(() -> {
            Calculator.calculatingDiscount(200, 0);
        }).isInstanceOf(ArithmeticException.class); // скидки нет

        assertThatThrownBy(() -> {
            Calculator.calculatingDiscount(200, 100);
        }).isInstanceOf(ArithmeticException.class); // при скидке равной 100%

        assertThatThrownBy(() -> {
            Calculator.calculatingDiscount(200, 110);
        }).isInstanceOf(ArithmeticException.class); // при скидке больше 100%
    }
}