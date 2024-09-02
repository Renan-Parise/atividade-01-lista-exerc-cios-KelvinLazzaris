/* Faça uma calculadora de troco, baseado nas cédulas da nossa moeda. */

package Exercícios.Lista_1;

import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner teclado = null;
        teclado = new Scanner(System.in);
        
        // Cédulas: 2, 5, 10, 20, 50, 100, 200

        System.out.print("\nQual é o valor da compra em R$ ");
        float valorCompra = teclado.nextFloat();
        
        System.out.print("\nDigite o valor que foi pago em R$ ");
        float valorPago = teclado.nextFloat();

        float troco = valorPago - valorCompra;

        if (valorPago < valorCompra) {
            System.out.println("\nVocê é um caloteiro!!!!");
        } else {
            int contaCedulas = 0;
            int[] cedulas = {200, 100, 50, 20, 10, 5, 2, 1};

            System.out.println("Troco R$ " + troco);

            for (int cedula: cedulas) {
                contaCedulas = (int)troco/cedula;

                if (contaCedulas > 0) {
                    System.out.println("O troco tem " + contaCedulas + " nota(s) de " + cedula);
                    troco = troco%cedula;
                }
            }
        }
    }
}