import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        boolean gameOver= true;
        int idade=2;
        boolean resultado= idade <= 18;
        JOptionPane.showMessageDialog(null, resultado);
        boolean resul= idade >= 18;
        JOptionPane.showMessageDialog(null, resul);

        String nome= "joao";
        boolean res= nome== "pedro";
        JOptionPane.showMessageDialog(null, res);


        //dados certos
        String usuario= "Henrique doido";
        String senha= "2355";

        //dados digitados
        String usuarioDigitado= "Joao";
        String senhaDigitada= "192223";

        boolean loginCorreto= usuario==usuarioDigitado && senha==senhaDigitada;
        System.out.println(loginCorreto);
    }
}
