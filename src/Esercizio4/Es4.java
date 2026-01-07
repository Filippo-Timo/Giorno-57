package Esercizio4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");

        for (int numero = scanner.nextInt(); numero >= 0; numero--) {
            System.out.println(numero);
        }

    }
}
