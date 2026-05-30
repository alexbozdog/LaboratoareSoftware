package ro.ulbs.proiectaresoftware.lab6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.ulbs.proiectaresoftware.advanced.NewIntCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewIntCalculatorTest {
    private NewIntCalculator calc;

    @BeforeEach
    public void setUp() {
        calc = new NewIntCalculator();
    }

    @Test
    void addTest1(){
        double d=0.1;

        assertTrue(d>0);

    }
    @Test
    public void testSubtract() {
        calc.init(20);
        int scazator = 5;
        int rezultatAsteptat = 15;

        int rezultatObtinut = (Integer)calc.subtract(scazator).result();

        assertEquals(rezultatAsteptat, rezultatObtinut);
    }

    @Test
    public void testMultiplyBy0() {
        calc.init(10);
        int inmultitor = 0;
        int rezultatAsteptat = 0;

        int rezultatObtinut = (Integer)calc.multiply(inmultitor).result();

        assertEquals(rezultatAsteptat, rezultatObtinut);
    }
}
