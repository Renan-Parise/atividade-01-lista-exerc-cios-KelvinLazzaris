/* Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo, obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles. */

/* OBS: 

Retângulo: Um triângulo é retângulo se um dos seus ângulos internos for exatamente 90 graus.
Obtusângulo: Um triângulo é obtusângulo se um dos seus ângulos internos for maior que 90 graus.
Acutângulo: Um triângulo é acutângulo se todos os seus ângulos internos forem menores que 90 graus.

Classificação pelo tipo de lado:

Equilátero: Um triângulo é equilátero se todos os seus três lados forem iguais.
Escaleno: Um triângulo é escaleno se todos os seus três lados forem diferentes.
Isósceles: Um triângulo é isósceles se dois dos seus lados forem iguais.

*/

package Exercícios.Lista_1;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        
        Scanner teclado = null;
        teclado = new Scanner(System.in);

        System.out.println("\nÂngulo 1: ");
        int Angulo_1 = teclado.nextInt();

        System.out.println("\nÂngulo 2: ");
        int Angulo_2 = teclado.nextInt();

        System.out.println("\nÂngulo 3: ");
        int Angulo_3 = teclado.nextInt();

        System.out.println("\nÂngulos: " + Angulo_1 + ", " + Angulo_2 + ", " + Angulo_3);

        if (Angulo_1 == 90 || Angulo_2 == 90 || Angulo_3 == 90) {
            System.out.println("\nCom base nos ângulos, é um triângulo retângulo.");    
        } else if (Angulo_1 > 90 || Angulo_2 > 90 || Angulo_3 > 90) {
            System.out.println("\nCom base nos ângulos, é um triângulo obtusângulo.");    
        } else if (Angulo_1 < 90 && Angulo_2 < 90 && Angulo_3 < 90) {
            System.out.println("\nCom base nos ângulos, é um triângulo acutângulo.");
        }

        System.out.println("\nLado 1: ");
        int Lado_1 = teclado.nextInt();

        System.out.println("\nLado 2: ");
        int Lado_2 = teclado.nextInt();

        System.out.println("\nLado 3: ");
        int Lado_3 = teclado.nextInt();

        System.out.println("\nLados: " + Lado_1 + ", " + Lado_2 + ", " + Lado_3);

        if (Lado_1 == Lado_2 && Lado_2 == Lado_3) {
            System.out.println("\nCom base nos lados, é um triângulo equilátero.");
        } else if (Lado_1 != Lado_2 && Lado_1 != Lado_3 && Lado_2 != Lado_3 ) {
            System.out.println("\nCom base nos lados, é um triângulo escaleno.");
        } else if ((Lado_1 == Lado_2 && Lado_1 != Lado_3) || (Lado_2 == Lado_3 && Lado_2 != Lado_1) || (Lado_1 == Lado_3 && Lado_1 != Lado_2)) {
            System.out.println("\nCom base nos lados, é um triângulo isósceles.");
        }

    }
}