import java.util.Scanner;

import javax.swing.JOptionPane;

public class telinha {
    public static void main(String[] args) throws Exception{
        String filme= JOptionPane.showInputDialog(null, "Qual seu filme favorito?", "title", JOptionPane.QUESTION_MESSAGE);
        System.out.println(filme);

        String texto= JOptionPane.showInputDialog(null, "Digite um numero: ");
        int numero= Integer.parseInt(texto);
        numero= numero*10;
        JOptionPane.showMessageDialog(null, "Numero x10: "+numero, "title", JOptionPane.INFORMATION_MESSAGE);
    }
}
