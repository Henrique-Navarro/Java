/*
Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar,
imprimir o resultado desta operação.
*/
//package lista2;
import java.util.Scanner;
public class exerc7 {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        int num,res;
        num= ler.nextInt();
        if(num % 2 ==0){
            res= num+5;
        }
        else{
            res= num+8;
        }
        System.out.println(res);
    }
}
