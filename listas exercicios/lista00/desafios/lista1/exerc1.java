/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/


import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args){
        Scanner ler= new Scanner (System.in);

        System.out.println("Quantos anos?");
        int anos;
        anos= ler.nextInt();

        System.out.println("Quantos meses?");
        int meses;
        meses= ler.nextInt();

        System.out.println("Quantos dias?");
        int dias;
        dias= ler.nextInt();

        int resultado;
        resultado= (anos*365)+(meses*30)+dias;
        System.out.println(resultado);
    }
}
