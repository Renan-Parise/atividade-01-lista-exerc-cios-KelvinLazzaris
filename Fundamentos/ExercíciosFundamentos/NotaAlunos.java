package Exercícios;

import javax.swing.JOptionPane;

public class NotaAlunos {
    public static void main(String[] args) {
        float[] notas = new float[10];
        float soma = 0, menor = 0, maior = 0;

        for (int i = 0; i < notas.length; i++) {
            
            String nota = JOptionPane.showInputDialog("Digite a: " + (i+1) + " nota");
            notas[i] = Float.parseFloat(nota);
            soma += notas[i];
        }

        menor = notas[0];
        maior = notas[0];

        for (float n : notas) {
            if (n < menor) {
                menor = n;
            }

            if (n > maior) {
                maior = n;
            }
        }

        JOptionPane.showMessageDialog(null, "Média: " + soma/notas.length);
        JOptionPane.showMessageDialog(null, "Maior: " + maior);
        JOptionPane.showMessageDialog(null, "Menor: " + menor);
    }
}