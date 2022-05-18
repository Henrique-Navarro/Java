package Calculadora;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x=scan.nextDouble(),y=scan.nextDouble();

		//percorre todos os valores de Sinais
		for(Sinais si : Sinais.values()) {
			System.out.println(x +" "+ si.getSinal() +" "+ y +" = "+ si.executarOperacao(x, y));
		}
		scan.close();
	}
}
