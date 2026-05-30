package ro.ulbs.proiectaresoftware.lab6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ro.ulbs.proiectaresoftware.advanced.DoubleCalculator;

public class DoubleCalculatorTest {
    private DoubleCalculator calc;

    @BeforeEach
    public void setUp() {
        calc = new DoubleCalculator();
    }
    @Test
    void addTest1(){
        double d=0.1;

        assertTrue(d>0);

    }
    @Test
    public void testSubtract() {
        calc.init(20.0);
        double scazator = 5.0;
        double rezultatAsteptat = 15.0;

        double rezultatObtinut = (Double) calc.subtract(scazator).result();

        assertEquals(rezultatAsteptat, rezultatObtinut);
    }

    @Test
    public void testMultiplyBy0() {
        calc.init(10.5);
        double inmultitor = 0.0;
        double rezultatAsteptat = 0.0;

        double rezultatObtinut = (Double) calc.multiply(inmultitor).result();

        assertEquals(rezultatAsteptat, rezultatObtinut);
    }
}
