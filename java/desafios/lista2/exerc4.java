/*
Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se
somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se
atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
*/
//package lista2;
import java.util.Scanner;
public class exerc4 {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        int A,B,res;
        A= ler.nextInt();
        B= ler.nextInt();

        if(A==B){
            res= A+B;
        }
        else{
            res= A*B;
        }
        System.out.println(res);
    }
}
