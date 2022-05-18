import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //TODO:função random
        double rand= Math.random();
        JOptionPane.showMessageDialog(null, Math.floor(rand*10));

        //random vai de 0 a 1
        //soma +1 para que não de 0
        //multiplica por 6 (maximo valor)
        int dado= 1+ (int) (Math.random() * 6);
        JOptionPane.showMessageDialog(null, dado);

        //TODO: classe random
        Random gerador= new Random();
        //6 é o valor máximo, e 1 é o mínimo
        int numero= gerador.nextInt(6)+1;

        //TODO: gera dado
        //https://www.youtube.com/watch?v=h5ZyZk9uhqA&list=PLGPluF_nhP9p6zWTN88ZJ1q9J_ZK148-f&index=8
    }
}
