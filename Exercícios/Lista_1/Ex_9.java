package Exercícios.Lista_1;

import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner teclado = null;
        teclado = new Scanner(System.in);

        System.out.println("\nDigite um número inteiro: ");
        int NumeroInteiro = teclado.nextInt();

        if (NumeroInteiro > 1 ) {
            for (int i = 2; i <= Math.sqrt(NumeroInteiro); i++) {
                if (NumeroInteiro % i == 0) {
                    System.out.println("\nEste número não é primo.");
                    break;
                } else {
                    System.out.println("\nEste número é primo.");
                }
            }
        } else if (NumeroInteiro == 1) {
            System.out.println("\nEste número não é primo.");
        } else {
            System.out.println("\nNúmero inválido.");
        }
    }
}
