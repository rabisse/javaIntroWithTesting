import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {assertEquals(6, calculator.add(2, 4));}

    @Test
    public void testSubtract() {assertEquals(-2, calculator.subtract(2, 4));}

    @Test
    public void testMultiply() {assertEquals(8, calculator.multiply(2, 4));}

    @Test
    public void testDivide() {assertEquals(2.0, calculator.divide(4.0, 2.0), 0.0);}

}
