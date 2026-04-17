package ro.ulbs.proiectaresoftware.lab6;

import org.junit.jupiter.api.Test;
import ro.ulbs.proiectaresoftware.advanced.NewIntCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewIntCalculatorTest {
    private NewIntCalculator calc;

    @Test
    void addTest1(){
        double d=0.1;

        assertTrue(d>0);

    }
    @Test
    public void testSubtract() {
        calc.init(20.0);
        assertEquals(15, calc.subtract(5).result());
    }

    @Test
    public void testMultiplyBy0() {
        calc.init(10.5);
        assertEquals(0, calc.multiply(0).result());
    }
}
