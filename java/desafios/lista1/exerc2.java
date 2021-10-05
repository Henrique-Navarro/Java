/*
Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
*/

public class exerc2 {
    public static void main(String[] args){
        float media1;
        float media2;

        media1= (8+9+7)/3;
        media2= (4+5+6)/3;

        System.out.printf("A media dos numeros 8,9,7 e: %.2f\n", media1);
        System.out.printf("A media dos numeros 4,5,6 e: %.2f\n" ,media2);
        System.out.printf("A soma das duas medias e: %.2f\n" ,(media1+media2));
    }
}
