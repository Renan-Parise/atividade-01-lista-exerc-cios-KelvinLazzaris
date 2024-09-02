public class Vetores {
    public static void main(String[] args) {
        // int[] vet = null; // Criação de vetor vazio;
        // vet é um objeto
        int[] vet = new int[10]; // Criação de um vetor tamanho 100

        // Matriz são vetores de vetores 
        // int[][] vet = new int[100][100];

        System.out.println(vet.length); // Ver tamanho do vetor

        // Os 2 for abaixo, fazem a mesma coisa, com a diferença que o for tem o controle do índice e o foreach é mais simples.
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

        for (int v : vet) {
            System.out.println(v);
        }

    }
}
