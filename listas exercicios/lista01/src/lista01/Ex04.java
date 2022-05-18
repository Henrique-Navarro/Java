package lista01;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		int ddd, op;
		Scanner ler= new Scanner(System.in);
		while(true) {
			System.out.print("Digite o ddd:\n");
			ddd= ler.nextInt();
			
			switch(ddd) {
			case 61:
				System.out.println("Brasilia");
				break;
			case 71:
				System.out.println("Salvador");
				break;
			case 11:
				System.out.println("Sao Paulo");
				break;
			case 21:
				System.out.println("Rio de Janeiro");
				break;
			case 32:
				System.out.println("Juiz de fora");
				break;
			case 19:
				System.out.println("Campinas");
				break;
			case 27:
				System.out.println("Vitoria");
				break;
			case 31:
				System.out.println("Belo Horizonte");
				break;
				
			default:
				System.out.println("DDD não cadastrado");
				break;
			}

			System.out.print("Quer continuar? [0]-sair");
			op= ler.nextInt();
			if(op==0) {break;}
		}
		ler.close();
	}
}
