
/*
O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde para dar
umaindicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2
Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição de acordo
com a tabela abaixo.
IMC em adultos Condição
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso
*/
//package lista2;
import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        double imc, peso, altura;

        peso= ler.nextDouble();
        altura= ler.nextDouble();

        imc= peso/ (altura*2);

        if(imc<18.5){
            System.out.println("Abaixo do peso");
        }
        if((imc>=18.5) && (imc<25)){
            System.out.println("Peso normal");
        }
        if((imc>=25) && (imc<30)){
            System.out.println("Acima do peso");
        }
        if(imc>30){
            System.out.println("Obeso");
        }
    }
}
