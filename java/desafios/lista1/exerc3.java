
/*
Informar um saldo e imprimir o saldo com reajuste de 1%.
*/
import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float saldo;
        System.out.println("Digite o saldo: ");
        saldo = ler.nextFloat();
        float resultado;
        resultado = saldo / 100 + saldo;
        System.out.printf("O saldo novo e de : R$%.2f", resultado);
    }
}
