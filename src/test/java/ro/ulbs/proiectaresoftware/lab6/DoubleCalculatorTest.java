package ro.ulbs.proiectaresoftware.lab6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ro.ulbs.proiectaresoftware.advanced.DoubleCalculator;

public class DoubleCalculatorTest {
    private DoubleCalculator calc;

    @Test
    void addTest1(){
        double d=0.1;

        assertTrue(d>0);

    }
    @Test
    public void testSubtract() {
        calc.init(20.0);
        assertEquals(15.0, calc.subtract(5.0).result());
    }

    @Test
    public void testMultiplyBy0() {
        calc.init(10.5);
        assertEquals(0.0, calc.multiply(0.0).result());
    }
}
