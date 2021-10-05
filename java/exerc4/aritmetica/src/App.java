import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numero1;
        int numero2;

        Scanner ler= new Scanner(System.in);
        numero1= ler.nextInt();
        numero2= ler.nextInt();

        int result= numero1+numero2;

        int n1=-5;
        int n2=6;
        int res= (int)Math.pow.ceil(10, 2);
        //potencia pow
        //raiz quadrada sqrt
        //ceil arredonda pra cima
        //floor arredonda pra baixo
        //Math.min(n1, n2) -> retorna o menor
        //Math.max(n1, n2) -> retorna o maior
        JOptionPane.showMessageDialog(null, "O resultado e: "+result, "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
