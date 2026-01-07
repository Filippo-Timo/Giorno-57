package Esercizio1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola, TRUE = numero di caratteri pari / FALSE = numero di caratteri dispari");
        String parola = scanner.nextLine();

        if (parola.length() % 2 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        System.out.println("Inserisci un numero, TRUE = bisestile / FALSE = non bisestile");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero % 4 == 0) {
            System.out.println("TRUE");
        } else if (numero % 100 == 0 && numero % 400 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
