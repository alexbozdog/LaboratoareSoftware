package ro.ulbs.proiectaresoftware.lab5;

public class AppLab5 {
    static void main(String[] args) {

        IntCalculator calculator = new IntCalculator(10);
        int resultA = calculator.add(5)
                .subtract(3)
                .multiply(2)
                .result();
        System.out.println("a) " + resultA);

        AdvancedCalculator advCalc = new AdvancedCalculator(2);
        int resultB = advCalc.add(8)
                .power(3)
                .divide(10)
                .root(2)
                .subtract(2)
                .result();

        System.out.println("b) " + resultB);


    }
}
