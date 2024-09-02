/* Faça um programa que receba dez números inteiros e mostre a quantidade de números
primos dentre os número que foram digitados. */

package Exercícios.Lista_1;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int Entradas = 11;

        for (int i = 1; i <= Entradas; i++) {
            System.out.println("\nDigite um número positivo: ");
            int Numero = teclado.nextInt();

            if (Numero < 2) {
                System.out.println("\nEste número não é primo.");
                continue;
            }

            boolean primo = true;

            // Verifica se o número é divisível por qualquer número de 2 até a raiz quadrada do número
            for (int j = 2; j <= Math.sqrt(Numero); j++) {
                if (Numero % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println("\nEste número é primo.");
            } else {
                System.out.println("\nEste número não é primo.");
            }
        }
    }
}
