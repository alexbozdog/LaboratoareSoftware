package ro.ulbs.proiectaresoftware.lab2;
import java.util.*;

public class AppLab2 {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d


        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }

        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        // a)reuniunea
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        // b) intersectia
        for (Integer val : x) {
            if (y.contains(val)) {
                zSet.add(val);
            }
        }

        // c) x - y
        for (Integer val : x) {
            if (!y.contains(val)) {
                xMinusY.add(val);
            }
        }

        // d) valori <= p
        for (Integer val : x) {
            if (val <= p) {
                xPlusYLimitedByP.add(val);
            }
        }

        for (Integer val : y) {
            if (val <= p) {
                xPlusYLimitedByP.add(val);
            }
        }

        Collections.sort(xPlusYLimitedByP);


        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("xPlusY = " + xPlusY);
        System.out.println("zSet = " + zSet);
        System.out.println("xMinusY = " + xMinusY);
        System.out.println("xPlusYLimitedByP = " + xPlusYLimitedByP);








    }
}
