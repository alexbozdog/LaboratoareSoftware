package ro.ulbs.proiectaresoftware.lab9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AppLab9 {
    public static void main(String[] args) {


        //9.3.1
            Random random = new Random();

            List<Integer> numere = IntStream.range(0, 10)
                    .map(i -> 5 + random.nextInt(21))
                    .boxed()
                    .collect(Collectors.toList());

            System.out.println("Lista initiala: " + numere);

            // a)
            int suma = numere.stream().reduce(0, Integer::sum);
            System.out.println("a) Suma elementelor: " + suma);

            // b)
            int max = numere.stream().max(Comparator.naturalOrder()).orElse(0);
            int min = numere.stream().min(Comparator.naturalOrder()).orElse(0);
            System.out.println("b) Maxim: " + max + ", Minim: " + min);

            // c)
            List<Integer> filtrate = numere.stream()
                    .filter(n -> n >= 10 && n <= 20)
                    .collect(Collectors.toList());
            System.out.println("c) Elemente in intervalul [10..20]: " + filtrate);

            // d)
            List<Double> numereDouble = numere.stream()
                    .map(n -> Double.valueOf(n))
                    .collect(Collectors.toList());
            System.out.println("d) Lista Double: " + numereDouble);

            // e)
            boolean contine12 = numere.stream().anyMatch(n -> n == 12);
            System.out.println("e) Contine valoarea 12? " + (contine12 ? "Da" : "Nu"));
            System.out.println();


            //9.3.2
        String text = "Acesta este un program scris in java pentru expresii lambda";
        List<String> cuvinte = Arrays.asList(text.split(" "));

        // a)
        List<String> cuvinteLungi = cuvinte.stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("a) Cuvinte >= 5 caractere: " + cuvinteLungi);
        System.out.println("   Numar cuvinte: " + cuvinteLungi.size());

        // b)
        List<String> ordonate = cuvinteLungi.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("b) Lista ordonata: " + ordonate);

        // c)
        Optional<String> cuvantCuP = cuvinte.stream()
                .filter(s -> s.startsWith("p"))
                .findFirst();
        cuvantCuP.ifPresent(s -> System.out.println("c) Primul cuvant care incepe cu 'p': " + s));
    }
}





