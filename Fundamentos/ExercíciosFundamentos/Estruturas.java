public class Estruturas {
    public static void main(String[] args) {
        String dados = "José;Ana;Maria;Pedro;Cláudia";
        String[] nomes = dados.split(";");

        for (int i = 0; i < nomes.length; i++) { // Escopo da variável é dentro do loop, é declarada dentro do for
            System.out.println(nomes[i]);
        }

        int i = 0;

        while (i < nomes.length) {
            System.out.println(nomes[i]); 
            i++;
        }

    }
}
