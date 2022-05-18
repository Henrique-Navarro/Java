/*
Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.
*/
import java.util.Scanner;
public class exerc6 {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        int numero;
        numero= ler.nextInt();
        int antecessor= numero-1;
        int sucessor= numero+1;
        System.out.println(antecessor);
        System.out.println(sucessor);
    }
}
