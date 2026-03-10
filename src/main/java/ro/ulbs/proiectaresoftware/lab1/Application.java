package ro.ulbs.proiectaresoftware.lab1;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        String alfabet = sb.toString();

        System.out.println("Litere mici: " + alfabet.toLowerCase());
        System.out.println("Majuscule: " + alfabet.toUpperCase());


        String vocale = "aeiou";
        List<String> segmente = new ArrayList<>();

        int start = 0;
        for (int i = 1; i < alfabet.length(); i++) {
            char caracterCurent = alfabet.charAt(i);

            if (vocale.indexOf(caracterCurent) != -1) {
                segmente.add(alfabet.substring(start, i));
                start = i;
            }
        }
        segmente.add(alfabet.substring(start));

        String[] arrayRezultat = segmente.toArray(new String[0]);

        System.out.println("Array-ul rezultat:");
        for (int i = 0; i < arrayRezultat.length; i++) {
            System.out.println("array[" + i + "] = \"" + arrayRezultat[i] + "\";");
        }
    }
}
