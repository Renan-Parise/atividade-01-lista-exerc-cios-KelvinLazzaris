package Exercícios.Lista_1;

import javax.swing.JOptionPane;

public class Ex_6 {
    public static void main(String[] args) {

        String entrada = JOptionPane.showInputDialog(null, "Digite um número positivo: ");
        int numero = Integer.parseInt(entrada);  // Aqui vai converter de string para int

        int CalcularFatorial = 1;

        if (numero > 1) {
            for (int i = 1; i <= numero; i++) {
                CalcularFatorial *= i;
            }
            JOptionPane.showMessageDialog(null, "O fatorial do número " + numero + " é: " + CalcularFatorial);
        } else if (numero == 1 || numero == 0) {
            JOptionPane.showMessageDialog(null, "O fatorial é 1.");
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido! Não existe fatorial de número negativo.");
        }
    }
}
