package test.java;

import main.java.FactorialCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        long expected = 1;
        long actual = FactorialCalculator.calculateFactorial(0);
        Assert.assertEquals(actual, expected, "Факториал 0 должен быть равен 1");
    }

    @Test
    public void testFactorialOfOne() {
        long expected = 1;
        long actual = FactorialCalculator.calculateFactorial(1);
        Assert.assertEquals(actual, expected, "Факториал 1 должен быть равен 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        long expected = 120;
        long actual = FactorialCalculator.calculateFactorial(5);
        Assert.assertEquals(actual, expected, "Факториал 5 должен быть равен 120");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.calculateFactorial(-1);
    }

    @Test
    public void testFactorialOfLargeNumber() {
        long expected = 2432902008176640000L;
        long actual = FactorialCalculator.calculateFactorial(20);
        Assert.assertEquals(actual, expected, "Факториал 20 должен быть равен 2432902008176640000");
    }
}
