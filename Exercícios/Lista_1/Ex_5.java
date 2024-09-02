/* Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
calcule e mostre:

• a quantidade de jogadores com idade inferior a 18 anos; OK
• a média das idades dos jogadores de cada time; OK
• a média das alturas de todos os jogadores do campeonato; OK
• a porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato. OK */


package Exercícios.Lista_1;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {

        Scanner teclado = null;
        teclado = new Scanner(System.in);

        int numeroJogadores = 22; // Precisa ser 55
        int menoresDe18 = 0;
        int maisDe80kg = 0;
        double somaDeIdades = 0;
        double somaDeAltura = 0;

        for (int time = 1; time <= 2; time++) {
            
            System.out.println("Time: " + time);

            for (int jogador = 1; jogador <= 11; jogador++) {
                System.out.println("\nJogador " + jogador + ":");
                
                System.out.println("\nIdade: ");
                int idade = teclado.nextInt();
                
                System.out.println("\nPeso: ");
                int peso = teclado.nextInt();
        
                System.out.println("\nAltura (em centímetros): ");
                int altura = teclado.nextInt();

                if (idade < 18) {
                    menoresDe18++;
                }

                if (peso > 80) {
                    maisDe80kg++;
                }
                
                somaDeIdades += idade;
                somaDeAltura += altura;
            }

            double mediaIdadeJogadores = somaDeIdades / numeroJogadores;
            System.out.println("\nA média de idades do time é: " + mediaIdadeJogadores + "\n");

        }

        System.out.println("\nJogadores menores de idade: " + menoresDe18);
        double mediaAlturaJogadores = somaDeAltura / numeroJogadores;
        double porcentagemJogadoresMaisDe80 = (maisDe80kg * 100.0) / numeroJogadores;
        
        System.out.println("\nA média de altura do time é: " + mediaAlturaJogadores);
        System.out.println("\nA porcentagem de jogadores com mais de 80kg é: " + porcentagemJogadoresMaisDe80 + "\n");

    }
}