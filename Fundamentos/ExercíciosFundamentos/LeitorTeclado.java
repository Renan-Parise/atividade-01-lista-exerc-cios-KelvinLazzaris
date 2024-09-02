import java.util.Scanner;

public class LeitorTeclado {

    public static void main(String[] args) {
        // declaração da variável teclado e criação da intância teclado do tipo Scanner
        Scanner teclado = null;
        teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine(); // next pega até encontrar espaço em branco | nextLine pega a linha toda |
        System.out.println("\nNome: " + nome);

        teclado.nextLine(); // precisa dessa gambiarra pra resolver o problema do nextLine depois de nextInt e nextDouble (quando eu leio um número antes de uma linha);
        
        System.out.println("\nDigite a sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("\nDigite a sua altura: ");
        double altura = teclado.nextDouble();

        System.out.println("\nA sua idade é: " + idade + "\n" + "A sua altura é: " + altura);
    }
    
}