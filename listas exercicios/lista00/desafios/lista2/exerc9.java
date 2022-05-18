/*
Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que
calcule seu peso ideal, utilizando as seguintes fórmulas:
para homens: (72.7 * h) – 58;
para mulheres: (62.1 * h) – 44.7.
*/
//package lista2;
import java.util.Scanner;
public class exerc9 {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        int altura;
        double peso;
        char sexo;
        altura= ler.nextInt();
        sexo= ler.next().charAt(0);

        if(Character.compare(sexo, 'F') >0){
            peso=(72.7 * altura) - 58;
        }
        else{
            peso=(62.1 * altura) - 44.7;
        }
        System.out.println("Seu peso ideal: "+peso);
    }
}
