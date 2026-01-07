package Essercizio3;

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String parola = "";

        while (!parola.equals(":q")) {
            System.out.println("Inserisci una parola");
            parola = scanner.nextLine();
            if (parola.equals(":q")) {
                break;
            }
            String risultato = "";
            for (int i = 0; i < parola.length() - 1; i++) {
                risultato = risultato + parola.charAt(i) + ",";
            }
            risultato = risultato + parola.charAt(parola.length() - 1);
            System.out.println(risultato);
        }
    }
}

