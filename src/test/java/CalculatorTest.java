import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(2, 4, 10.0, 5.0);
    }

    @Test
    public void hasNum1() {assertEquals(2, calculator.getNum1());}

    @Test
    public void hasNum2() {assertEquals(4, calculator.getNum2());}

    @Test
    public void testAdd() {assertEquals(6, calculator.addNums());}

    @Test
    public void testSubtract() {assertEquals(-2, calculator.subtractNums());}

    @Test
    public void testMultiply() {assertEquals(8, calculator.multiplyNums());}

    @Test
    public void testDivide() {assertEquals(2.0, calculator.divideNums(), 0.0);}
}

