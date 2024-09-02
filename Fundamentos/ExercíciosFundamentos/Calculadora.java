package Exercícios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int n1 = teclado.nextInt(); // lendo inteiro

        System.out.print("Informe outro número inteiro: ");
        int n2 = teclado.nextInt(); // lendo inteiro

        System.out.print("Escolha seu operador matemático: ");
        char operador = teclado.next().charAt(0); // lendo operador matemático
        
        System.out.println("Número 1: " + n1 + ", Número 2: " + n2 + ", Operador: " + operador); // mostrando todos os itens antes de fazer a conta

        float resultado = 0;

        if (operador == '+') {
            System.out.println("Resultado é: " + (n1 + n2));
        } else if (operador == '-') {
            System.out.println("Resultado é: " + (n1 - n2));
        } else if (operador == '*') {
            System.out.println("Resultado é: " + (n1 * n2));
        } else if (operador == '/') {
            System.out.println("Resultado é: " + (float)n1 / n2);
        }

        // n1 / n2;
        // Desse jeito, o resultado vai ser inteiro, ou seja, 10 / 3 = 3 (pois 3 cabe uma vez dentro de 5)

        // (float)n1 / n2;
        // Desse jeito, também vai ser divisão inteira, porém transforma em número real 10 / 3 = 3.0 (sempre vai ser .0)

        // (float)(n1 / n2);
        // Desse jeito, 10 / 3 = 3.3333 (faz a conta correta)

        switch (operador) {
            case '+':
            System.out.println("Resultado é: " + (n1 + n2));
            break;
        
            case '-':
            System.out.println("Resultado é: " + (n1 - n2));
            break;

            case '*':
            System.out.println("Resultado é: " + (n1 * n2));
            break;
        
            case '/':
            System.out.println("Resultado é: " + (float)n1 / n2); 
            break;
        }

        teclado.close();

    }
}