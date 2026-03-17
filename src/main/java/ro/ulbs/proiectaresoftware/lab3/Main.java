package ro.ulbs.proiectaresoftware.lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("in.txt");
        Path pathOut = Paths.get("out.txt");
        try {

            List<String> linii = Files.readAllLines(path);
            List<String> rezultatFinal = new ArrayList<>();
            //a
            for (String linie : linii) {

                String A = linie + "\n";
                System.out.print(A + "\n");
                rezultatFinal.add(A);

            }
            for (String linie : linii) {

                String B = linie.replace(".", ".\n");
                System.out.println(B);
                rezultatFinal.add(B);
            }
            Files.write(pathOut, rezultatFinal);

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
