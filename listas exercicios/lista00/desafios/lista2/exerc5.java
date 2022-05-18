/*
Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo,
imprimindo o resultado.
*/
//package lista2;
import java.util.Scanner;
public class exerc5 {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        int num,res;
        num= ler.nextInt();

        if(num>0){
            res= num*2;
        }
        else{
            res= num*3;
        }
        System.out.println(res);
    }
}
