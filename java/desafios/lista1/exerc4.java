/*
Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
*/
import java.util.Scanner;
public class exerc4 {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        float ipi, codigo1, valor1, quantidade1;
        float codigo2, valor2, quantidade2, resultado;

        ipi= ler.nextFloat();
        
        codigo1= ler.nextFloat();
        valor1= ler.nextFloat();
        quantidade1= ler.nextFloat();

        codigo2= ler.nextFloat();
        valor2= ler.nextFloat();
        quantidade2= ler.nextFloat();
        
        resultado=(valor1*quantidade1 + valor2*quantidade2)*(ipi/100 +1);
        System.out.printf("O total a ser pago e de: %.2f", resultado);
    }
}
