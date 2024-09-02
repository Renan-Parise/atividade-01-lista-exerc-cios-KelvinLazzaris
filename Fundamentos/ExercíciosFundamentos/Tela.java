import javax.swing.JOptionPane;

public class Tela {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: "); // Abre uma caixa de diálogo apenas pra perguntar o nome e dizer bem-vindo

        JOptionPane.showMessageDialog(null, "Bem-vindo " + nome);
    }
}