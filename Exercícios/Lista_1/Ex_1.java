/* Faça um programa que recebe o número de horas trabalhadas, e o valor da hora trabalhada. Calcule e mostre o salário a receber seguindo estas regras:

• o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
• o imposto equivale a 30% do salário bruto;
• o salário a receber equivale ao salário bruto menos o imposto. */

package Exercícios.Lista_1;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {

        Scanner teclado = null;
        teclado = new Scanner(System.in);

        System.out.println("\nDigite o número de horas trabalhadas: ");
        int NumeroHorasTrabalhadas = teclado.nextInt();

        System.out.println("\nDigite o valor de horas trabalhadas: ");
        int ValorHorasTrabalhadas = teclado.nextInt();

        int SalarioBruto = NumeroHorasTrabalhadas * ValorHorasTrabalhadas;
        System.out.println("\nO seu salário bruto é: " + SalarioBruto);

        float Imposto = 0.30f;
        float ValorComImposto = SalarioBruto * Imposto;
        System.out.println("\nValor com imposto é: " + ValorComImposto); 

        float SalarioAReceber = SalarioBruto - ValorComImposto;
        System.out.println("\nO seu salário a receber é: " + SalarioAReceber + "\n");
    }
}
