/*
Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar
*/
import java.util.Scanner;
//package lista2;
public class exerc3 {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        int num;

        num= ler.nextInt();
        if(num % 2 == 0){
            System.out.println("O numero "+num+" e par");
        }
        else{
            System.out.println("O numero "+num+" e impar");
        }
    }
}
