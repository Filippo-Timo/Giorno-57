package Esercizio2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {

        System.out.println("Inserisci un numero da o a tre");
        Scanner scanner = new Scanner(System.in);
        int numero = Integer.parseInt(scanner.nextLine());

        switch (numero) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("UNO");
            case 2 -> System.out.println("DUE");
            case 3 -> System.out.println("TRE");
            default -> System.out.println("Il numero inserito non è valido");
            
        }
    }
}
