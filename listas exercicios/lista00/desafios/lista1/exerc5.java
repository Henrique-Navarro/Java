
/*
Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)

*/
import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float salarioMin = 1000, salario, resultado;
        salario = ler.nextFloat();
        resultado = salario / salarioMin;
        System.out.printf("VC recebe %.0f salarios minimos", Math.floor(resultado));
    }
}
