/* Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência, 
calcule e mostre:

• o valor de cada quilowatt;
• o valor a ser pago por essa residência. */

package Exercícios.Lista_1;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner teclado = null;
        teclado = new Scanner(System.in);
        
        System.out.println("\nDigite o salário mínimo: ");
        int SalarioMinimo = teclado.nextInt();

        System.out.println("\nDigite a quantidade de quilowatts consumuido por uma residência: ");
        int QuantidadeQuilowatts = teclado.nextInt();

        float ValorQuilowatts = 0.01f;

        float ValorCadaQuilowatt = SalarioMinimo * ValorQuilowatts;
        System.out.println("\nO valor de cada quilowatt é: " + ValorCadaQuilowatt);

        float ValorCadaResidencia = ValorCadaQuilowatt * QuantidadeQuilowatts;
        System.out.println("\nO valor a ser pago por essa residência é: " + ValorCadaResidencia + "\n");
    }
}
