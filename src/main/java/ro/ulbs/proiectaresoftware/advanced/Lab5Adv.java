package ro.ulbs.proiectaresoftware.advanced;

public class Lab5Adv {
    static void main(String[] args) {
        NewIntCalculator intCalc = new NewIntCalculator();
        intCalc.init(10);
        Integer resInt = (Integer) intCalc.add(5)
                .subtract(3)
                .multiply(2)
                .result();

        System.out.println("Rezultat Integer " + resInt);

        DoubleCalculator doubleCalc = new DoubleCalculator();
        doubleCalc.init(10.0);
        Double resDouble = (Double) doubleCalc.add(5.0)
                .subtract(3.3)
                .multiply(2.2)
                .result();

        System.out.format("Rezultat Double = %.2f%n", resDouble);

    }
}
