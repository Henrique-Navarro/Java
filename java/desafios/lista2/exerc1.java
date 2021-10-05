/*
Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor
que C.
*/
import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        int A,B,C,som;
        A= ler.nextInt();
        B= ler.nextInt();
        C= ler.nextInt();

        som= A+B;
        if(som<C){
            System.out.printf("A soma entre %d+%d= %d menor que %d", A,B,som,C);
        }
        else{
            System.out.println("A soma é maior");
        }
    }
}
