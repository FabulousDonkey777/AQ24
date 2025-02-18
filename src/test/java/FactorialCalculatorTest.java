import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorialZero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0), "Факториал 0 должен быть 1.");
    }

    @Test
    public void testCalculateFactorialOne() {
        assertEquals(1, FactorialCalculator.calculateFactorial(1), "Факториал 1 должен быть 1.");
    }

    @Test
    public void testCalculateFactorialPositiveNumber() {
        assertEquals(120, FactorialCalculator.calculateFactorial(5), "Факториал 5 должен быть 120.");
    }

    @Test
    public void testCalculateFactorialLargeNumber() {
        assertEquals(3628800, FactorialCalculator.calculateFactorial(10), "Факториал 10 должен быть 3628800.");
    }

    @Test
    public void testCalculateFactorialNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.calculateFactorial(-1);
        });
        assertEquals("Факториал отрицательного числа не существует.", exception.getMessage());
    }
}