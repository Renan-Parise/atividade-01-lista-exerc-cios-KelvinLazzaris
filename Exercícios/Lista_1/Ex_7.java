/* Faça um programa que leia dois números e apresente o fatorial de todos os números
que estejam dentro do intervalo definido pelos números que foram lidos */

package Exercícios.Lista_1;

import java.util.Scanner;

public class Ex_7 {
    public static long fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = null;
        teclado = new Scanner(System.in);

        System.out.println("\nDigite o primeiro número:");
        int num1 = teclado.nextInt();

        System.out.println("\nDigite o segundo número:");
        int num2 = teclado.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("Fatoriais dos números no intervalo de " + menor + " a " + maior + ":");

        for (int i = menor; i <= maior; i++) {
            System.out.println(i + "! = " + fatorial(i));
        }
    }
}
