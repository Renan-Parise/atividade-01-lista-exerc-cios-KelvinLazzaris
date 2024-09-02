/* Faça um programa que receba:

• O código do produto comprado;
• A quantidade comprada do produto

Calcule e mostre:

• O preço unitário do produto comprado, seguindo a Tabela I;
• O preço total da nota;
• O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
• O preço final da nota depois do desconto.

Tabela I:

Código                        Preço
---------------------------------------------------
1 a 10                        R$ 10,00
11 a 20                       R$ 15,00
21 a 30                       R$ 20,00
31 a 40                       R$ 40,00 

=========================================================

Tabela II:

Preço Total da Nota           % de Desconto
---------------------------------------------------
Até R$ 250,00                 5%
Entre R250, 00 e R$500,00     10%
Acima de R$ 500,00            15%

*/

package Exercícios.Lista_1;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner teclado = null;
        teclado = new Scanner(System.in);

        System.out.println("\nDigite o código do produto: ");
        int CodigoProduto = teclado.nextInt();

        System.out.println("\nQuantidade do produto: ");
        int QuantidadeProduto = teclado.nextInt();

        if (CodigoProduto < 11) {
            int PrecoTotal = 10 * QuantidadeProduto;
            System.out.println("\nO preço unitário do produto é: 10 e o preço total da nota é: " + PrecoTotal);

            if (PrecoTotal < 251) {
                float PrecoDesconto = 0.05f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);

            } else if (PrecoTotal < 501) {
                float PrecoDesconto = 0.10f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);

            } else if (PrecoTotal > 500) {
                float PrecoDesconto = 0.15f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);

            }

        } else if (CodigoProduto < 21) {
            int PrecoTotal = 20 * QuantidadeProduto;
            System.out.println("\nO preço unitário do produto é: 20 e o preço total da nota é: " + PrecoTotal);

            if (PrecoTotal < 251) {
                float PrecoDesconto = 0.05f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);


            } else if (PrecoTotal < 501) {
                float PrecoDesconto = 0.10f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);

            } else if (PrecoTotal > 500) {
                float PrecoDesconto = 0.15f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);

            }

        } else if (CodigoProduto < 31) {
            int PrecoTotal = 30 * QuantidadeProduto;
            System.out.println("\nO preço unitário do produto é: 30 e o preço total da nota é: " + PrecoTotal);

            if (PrecoTotal < 251) {
                float PrecoDesconto = 0.05f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);


            } else if (PrecoTotal < 501) {
                float PrecoDesconto = 0.10f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);

            } else if (PrecoTotal > 500) {
                float PrecoDesconto = 0.15f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);

            }

        } else if (CodigoProduto < 41) {
            int PrecoTotal = 40 * QuantidadeProduto;
            System.out.println("\nO preço unitário do produto é: 40 e o preço total da nota é: " + PrecoTotal);

            if (PrecoTotal < 251) {
                float PrecoDesconto = 0.05f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);


            } else if (PrecoTotal < 501) {
                float PrecoDesconto = 0.10f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);

            } else if (PrecoTotal > 500) {
                float PrecoDesconto = 0.15f * PrecoTotal;
                float PrecoComDesconto = PrecoTotal - PrecoDesconto;
                System.out.println("\nO valor do desconto aplicado é: " + PrecoDesconto);
                System.out.println("\nO valor final com o desconto aplicado é: " + PrecoComDesconto);

            }

        }
    }
}